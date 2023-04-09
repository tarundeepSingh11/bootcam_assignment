package com.restapi2.restapi2.Dynamicfiltering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class filterr {
   @GetMapping("/filterr")
    public MappingJacksonValue filterw(){
        UserForFilterr bb= new UserForFilterr("Tarundeep","Singh","abcd");
       MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(bb);
       SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("firtName","lastName");
       FilterProvider filterProvider=new SimpleFilterProvider().addFilter("somefilter",filter);
       mappingJacksonValue.setFilters(filterProvider);
       return mappingJacksonValue;
    }

   @GetMapping("/filter-list")
    public MappingJacksonValue  filterDynamic(){
       List<UserForFilterr> list= Arrays.asList(new UserForFilterr("karan","singh","QWE"), new UserForFilterr("mohit","khanna","tui"));

       MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(list);
       SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("firtName","password");
       FilterProvider filterProvider=new SimpleFilterProvider().addFilter("somefilter",filter);
       mappingJacksonValue.setFilters(filterProvider);
       return mappingJacksonValue;
   }
}
