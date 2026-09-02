package com.karthik.ecomm.Config;

import com.karthik.ecomassistantService.DepricatedUtilityService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(value = "com.karthik",
        excludeFilters = @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE,classes= DepricatedUtilityService.class)
)
public class EcomConfig {

}
