package org.example.Flyweight;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.Flyweight.AdditionalTOBeRenamed.Vector3D;


@Getter
@Setter
@Builder
@ToString
public class BulletExtrensicFeature {
    private IntrensicFeature intensicFeature;
    private Vector3D trajectory;
    private Vector3D bulletStartingPoint;
    private Vector3D bulletDestinationPoint;
}
