package com.creation.d04_prototype;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author xjn
 * @since 2020-03-18
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Sheep sheep = new Sheep("name", 1, "red");
        Sheep clone = (Sheep) sheep.clone();
        System.out.println(sheep.equals(clone));
        System.out.println(sheep.hashCode());
        System.out.println(clone.hashCode());


        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(sheep);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Object object = objectInputStream.readObject();
        System.out.println(object);

    }
}
