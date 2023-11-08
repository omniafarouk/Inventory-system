package frontend;

import javax.swing.JFrame;

public class Navigation {
    public void setNavigation(JFrame windowToShow,JFrame windowToHide){
        windowToHide.setVisible(false);
        windowToShow.setVisible(true);
    } 
}