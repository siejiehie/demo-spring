package io.toya.ch03.conditional;

/**
 * Created by Sai on 2017/3/10.
 */
public class WindowsListService implements ListService {

    @Override
    public String showListCmd() {
        return "dir";
    }
}
