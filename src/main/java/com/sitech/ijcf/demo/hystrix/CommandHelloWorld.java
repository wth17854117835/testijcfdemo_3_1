package com.sitech.ijcf.demo.hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;


/**
 * 项目名称：	iJCF
 * 类名称：	CommandHelloWorld
 * 创建人：  qianym
 * 创建时间：	2017/11/1 9:54
 *
 * @Copyright: Copyright(c) 2017
 */
public class CommandHelloWorld extends HystrixCommand<String> {


    private final String name;

    public CommandHelloWorld(String name) {
        super(HystrixCommandGroupKey.Factory.asKey(name));
        this.name = name;
    }

    @Override
    protected String run() {
        return "Hello " + name + "!";
    }



    public static void main(String []args)
    {
        CommandHelloWorld commandHelloWorld = new CommandHelloWorld("Bob");
        //Future<String> s = new CommandHelloWorld("Bob").queue();
        //Observable<String> s = new CommandHelloWorld("Bob").observe();

        String s = commandHelloWorld.execute();



        System.out.println(s);
    }

}
