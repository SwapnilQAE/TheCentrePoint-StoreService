package com.tcp.storeService.config;

import com.tcp.storeService.daoLayer.model.Store;
import com.tcp.storeService.daoLayer.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DataInit implements ApplicationRunner {
    @Autowired
    private StoreRepository storeRepository;

    public DataInit(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = storeRepository.count();
        if (count == 0) {
            Store s1 = new Store(123456, true, "123456, true 12.76, 76.456",  12.76,  76.456);
            Store s2 = new Store(789012, false, "789012, true 14.76, 77.456",  14.76,  77.456);
            storeRepository.save(s1);
            storeRepository.save(s2);
        }

    }

}