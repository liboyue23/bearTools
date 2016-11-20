package com.manager;

import com.thoughtworks.xstream.XStream;

/**
 * @author boyue.lby
 * @date 20/11/2016 14:05
 */
public class SlowYGC {
    public static void main(String[] args) {
        int i=0;
        while (true){
            XStream xs = new XStream();
            xs.toString();
            xs=null;
        }
    }
}
