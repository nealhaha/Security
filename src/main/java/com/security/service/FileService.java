/*
* Copyright (c) 2014 Qunar.com. All Rights Reserved.
*/
package com.security.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author rui.deng  Date: 2015/3/27 Time: 0:05
 * @version 1.0.0
 */
@Service
public class FileService {

    public static final Logger logger = LoggerFactory.getLogger(FileService.class);

    public void readTxtFile(String sourceFile) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(sourceFile));
            String aline;
            while ((aline = bufferedReader.readLine()) != null) {
                //String[] stringarray = aline.split("\t");
                logger.debug("{}", aline);
            }
        } catch (IOException e) {
            logger.error("文件读取异常：{}", e);
        }
    }
}
