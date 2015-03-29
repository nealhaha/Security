/*
* Copyright (c) 2014 Qunar.com. All Rights Reserved.
*/
package com.security.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author rui.deng  Date: 2015/3/27 Time: 0:14
 * @version 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class FileServiceTest {

    @Autowired
    private FileService fileService;

    @Test
    public void testFileRead() {
        String inputFileName = "M1505.TXT";
        fileService.readTxtFile(inputFileName);
    }
}
