package com.zp.design.pattern.creational.factory.simplefactory;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author: zhengpanone
 * @Description:
 * @Date:Created in 2021/07/06 10:27.
 * @Email zhengpanone@hotmail.com
 * @Modified By:
 */
public class VideoFactory {
    public Video getVideo(Class classType) {
        /*if (classType.getName().equals(JavaVideo.class.getName())) {
            return new JavaVideo();
        } else if (classType.getName().equals(PythonVideo.class.getName())) {
            return new PythonVideo();
        }
        return null;*/
        Video video = null;
        try {
            //java9后 clazz.newInstance()别替换为 clazz.getDeclaredConstructor().newInstance()
            video = (Video) Class.forName(classType.getName()).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return video;
    }

    public Video getVideo(String type) {
        Video video = null;
        switch (type) {
            case "java":
                video = new JavaVideo();
                break;
            case "python":
                video = new PythonVideo();
                break;
        }
        return video;
    }
}
