package com.learning.springCloud.controller;


import com.learning.springCloud.entities.CommonResult;
import com.learning.springCloud.entities.Payment;
import com.learning.springCloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhumengren
 * @since 2021-12-08
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    /*
     * @Author zhumengren
     * @param payment
     * @Date 2021/12/8 12:46
     * @Description 新建一条数据
     **/
    // @RequestBody(required = false)
    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        Payment payment1 = paymentService.create(payment);
        log.info("*********插入数据成功！");
        if (payment1 != null && !payment1.equals("")) {
            System.out.println("成功！");
            CommonResult commonResult = new CommonResult(200, "数据插入成功！", payment);
            System.out.println("commonResult的值为：" + commonResult);
            return commonResult;
        } else {
            System.out.println("失败！");
            return new CommonResult(405, "数据插入失败！");
        }
    }

    /*
     * @Author zhumengren
     * @param id
     * @Date 2021/12/8 12:46
     * @Description 通过payment的id查询payment对象
     **/
    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
//        System.out.println("Controler层执行开始！");
        Payment paymentById = paymentService.getPaymentById(id);
        if (paymentById != null) {
            return new CommonResult(200, "成功查询到数据！", paymentById);
        } else {
            return new CommonResult(405, "数据没有被查询到！查询时使用的id是" + id);
        }
    }
}

