package com.zp.design.pattern.creational.factory.simplefactory;

/**
 * @Author: zhengpanone
 * @Description:
 * @Date:Created in 2021/07/06 10:26.
 * @Email zhengpanone@hotmail.com
 * @Modified By:
 */
public class Test {
    public static void main(String[] args) {
//        Video javaVideo = new JavaVideo();
//        javaVideo.produce();
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(PythonVideo.class);
        video.produce();
        Video javaVideo = videoFactory.getVideo("java");
        javaVideo.produce();
    }
}
