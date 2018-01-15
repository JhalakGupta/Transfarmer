/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Crops;

/**
 *
 * @author AMY
 */
public class Crop {

    private CropType cropType;

    public enum CropType {
        Wheat("Wheat"),
        Rice("Rice"),
        Maize("Maize"),
        Pulses("Pulses");

        private String value;

        private CropType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public CropType getEnterpriseType() {
        return cropType;
    }
}
