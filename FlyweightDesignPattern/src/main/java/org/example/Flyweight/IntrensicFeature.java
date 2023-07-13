package org.example.Flyweight;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class IntrensicFeature {
    private int bulletWeight;
    private String bulletDimenSion;
    private int bulletMaxDamage;
    private byte[] bulletImage;
}
