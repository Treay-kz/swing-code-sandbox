package com.treay.swingojcodesandbox;


import com.treay.swingojcodesandbox.model.ExecuteCodeRequest;
import com.treay.swingojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 *
 * @author Treay
 */
public interface CodeSandBox {

    /**
     * 代码沙箱执行代码接口
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
