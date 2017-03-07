package io.toya.chap1.javaconfig;

/**
 * Created by Sai on 2017/3/7.
 */
public class UseFunctionService {

    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }

}
