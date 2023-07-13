package org.example;

import org.example.Flyweight.AdditionalTOBeRenamed.Vector3D;
import org.example.Flyweight.BulletExtrensicFeature;
import org.example.Flyweight.IntrensicFeature;

public class Main {
    public static void main(String[] args) {
        IntrensicFeature intrensicFeatureBullet12 = IntrensicFeature.builder()
                .bulletImage(new byte[2])
                .bulletDimenSion("12*12*12")
                .bulletWeight(12)
                .bulletMaxDamage(45)
                .build();
        IntrensicFeature intrensicFeatureBullet45 = IntrensicFeature.builder()
                .bulletImage(new byte[2])
                .bulletDimenSion("45*45*45")
                .bulletWeight(45)
                .bulletMaxDamage(60)
                .build();


        BulletExtrensicFeature bulletExtrensicFeature = BulletExtrensicFeature
                .builder()
                .intensicFeature(intrensicFeatureBullet12)
                .bulletStartingPoint(Vector3D.builder().i(1).j(2).k(3).build())
                .bulletDestinationPoint(Vector3D.builder().i(4).j(5).k(6).build())
                .trajectory(Vector3D.builder().i(0).j(1).k(2).build())
                .build();

        System.out.println(bulletExtrensicFeature.toString());


    }
}