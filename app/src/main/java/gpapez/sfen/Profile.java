package gpapez.sfen;

import java.util.ArrayList;
import java.util.Random;

/**
 * PROFILE CLASS
 */
public class Profile {

    /**
     *
     * VARIABLES
     *
     */
    private String name;
    private int icon;
    private int uniqueID;
    private boolean isActive;

    private ArrayList<DialogOptions> actions = new ArrayList<DialogOptions>();

    /**
     * SETTING VARIABLES
     */
    private boolean isVibrate;
    private int brightnessValue;
    private boolean brightnessAuto;



    /**
     *
     * CONSTRUCTOR
     *
     */
    public Profile() {

        /**
         * creating unique id for current profile
         */
        uniqueID = Math.abs(new Random().nextInt());

        /**
         * set profile to not running
         */
        isActive = false;

    }

    /**
     * function updates flags for active/non-active profiles
     * where id should be set to active.
     *
     * @param id
     */
    public static void updateActiveProfile(int id) {
        Profile p;

        for (int i = 0; i < BackgroundService.getInstance().profiles.size(); i++) {
            p = BackgroundService.getInstance().profiles.get(i);

            /**
             * found our match
             */
            if (p.getUniqueID() == id) {

                BackgroundService.getInstance().profiles.get(i).setActive(true);

            }

            /**
             * deactivate all others profiles
             */
            else {

                BackgroundService.getInstance().profiles.get(i).setActive(false);

            }

        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<DialogOptions> getActions() {
        return actions;
    }

    public void setActions(ArrayList<DialogOptions> actions) {
        this.actions = actions;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isVibrate() {
        return isVibrate;
    }

    public void setVibrate(boolean isVibrate) {
        this.isVibrate = isVibrate;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    public int getBrightnessValue() {
        return brightnessValue;
    }

    public void setBrightnessValue(int brightnessValue) {
        this.brightnessValue = brightnessValue;
    }

    public boolean isBrightnessAuto() {
        return brightnessAuto;
    }

    public void setBrightnessAuto(boolean brightnessAuto) {
        this.brightnessAuto = brightnessAuto;
    }
}
