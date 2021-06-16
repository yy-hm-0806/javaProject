package com.example.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.common.Result;
import com.example.entity.Salary;
import com.example.entity.User;
import com.example.service.SalaryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/salary")
public class SalaryController {
    @Resource
    private SalaryService service;

    @PostMapping()
    public Result<?> paySalary(@RequestBody Salary salary){
        service.save(salary);
        return Result.success();
    }

    @GetMapping
    public Result<List<Salary>> findAll() {
        return Result.success(service.list());
    }

    @GetMapping("/page")
    public Result<IPage<Salary>> findPage(@RequestParam(required = false, defaultValue = "") String name,
                                        @RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                        @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return Result.success(service.page(new Page<>(pageNum, pageSize), Wrappers.<Salary>lambdaQuery().like(Salary::getUid, name).orderByDesc(Salary::getId)));
    }

    @GetMapping("/pageById")
    public Result<IPage<Salary>> findPageById(@RequestParam(required = false, defaultValue = "") String name,
                                          @RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                          @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                                              @RequestParam(required = true)Integer uid) {
        return Result.success(service.page(new Page<>(pageNum, pageSize), Wrappers.<Salary>lambdaQuery().eq(Salary::getUid,uid).like(Salary::getDate, name).orderByDesc(Salary::getId)));
    }


    @PutMapping
    public Result<?> update(@RequestBody Salary salary) {
        return Result.success(service.updateById(salary));
    }

    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable Integer id) {
        service.removeById(id);
        return Result.success();
    }
}
