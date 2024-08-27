package com.treay.swingojcodesandbox.template;

import com.treay.swingojcodesandbox.model.ExecuteCodeRequest;
import com.treay.swingojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.stereotype.Component;

/**
 * 原生Java代码沙箱 - 实现模板方法
 *
 * @author Treay 
 */
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate {


    /**
     * 执行程序
     * @param executeCodeRequest
     * @return
     */
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }
}
