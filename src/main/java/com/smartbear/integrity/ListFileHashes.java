/*
 * Copyright 2004-2014 SmartBear Software
 *
 * Licensed under the EUPL, Version 1.1 or - as soon as they will be approved by the European Commission - subsequent
 * versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://ec.europa.eu/idabc/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is
 * distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the Licence for the specific language governing permissions and limitations
 * under the Licence.
*/
package com.smartbear.integrity;

import java.io.File;

public class ListFileHashes {

    public static void main(String[] args) throws Exception {

        //final String dir = "/home/shadid/SmartBear/ReadyAPI-1.4.0/lib";
        final String dir = args[0];
        JarCheckSum checkSum = new JarCheckSum();

        ListFiles jarList = new ListFiles(dir);

        for(String name: jarList.sortedJarList()){
            final String pathToJar = dir + File.separator + name;
            System.out.print(pathToJar +"\t");
            System.out.println(checkSum.calculateHash(pathToJar));
        }
    }
}
