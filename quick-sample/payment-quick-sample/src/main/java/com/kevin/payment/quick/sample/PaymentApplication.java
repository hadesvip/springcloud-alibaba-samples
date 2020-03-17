package com.kevin.payment.quick.sample;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author wangyong
 */
@SpringBootApplication
public class PaymentApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(PaymentApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
