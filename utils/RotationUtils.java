public class RotationUtils extends MinecraftInstance {

  
    /**
     * Returns the actual value of the GCD 
     * (taking into account the sensitivity of the mouse and 
     *          the multipliers of the minecraft setAngles method)
     *          
     * @see net.minecraft.entity.Entity
     *      Method: setAngles
     * 
     * @return (float) GCD Factor
     */
    public static float getGCDValue() {
        return (float) (getGCD() * .15);
    }

    /** Generates a GCD value
     *
     * @see net.minecraft.client.renderer.EntityRenderer
     *      Method: updateCameraAndRender
     *
     * @author koloslolya
     */
    public static float getGCD() {
        float f1;
        return (f1 = (float) (mc.gameSettings.mouseSensitivity * .6 + .2)) * f1 * f1 * 8;
    }

    /** It needs for quality GCD fix
     * This method selects the closest value that the mouse can make
     * (Simulates deltaMouse values)
     *
     *  How to use: RotationUtils.getDeltaMouse(20.0F) * RotationUtils.getGCDValue()
     *
     * @param delta (float), delta yaw/pitch
     * @author koloslolya
     * @return (float) Closest value to mouse delta
     */
    public static float getDeltaMouse(float delta) {
        return Math.round(delta / getGCDValue());
    }

}
