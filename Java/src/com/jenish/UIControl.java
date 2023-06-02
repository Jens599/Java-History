package com.jenish;

public class UIControl {
    private boolean isEnable = true;

    public UIControl(boolean isEnable) {
        this.isEnable = isEnable;
        System.out.println("uiControl");
    }

    public void enable(){
        isEnable = true;
    }

public void disable(){
        isEnable = false;
    }

    public boolean isEnable() {
        return isEnable;
    }
}
