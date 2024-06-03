package com.exercise.calculator.demo_exercise1.infra;

import com.exercise.calculator.demo_exercise1.dto.ResultDTO;

public class ApiResp<T> {
  private String code;
  private String msg;
  private ResultDTO resultDTO;

  public String getCode() {
    return this.code;
  }

  public String getMsg() {
    return this.msg;
  }

  public ResultDTO getdata() {
    return this.resultDTO;
  }

  public ApiResp(ApiRespBuilder<T> apiRespBuilder) {
    this.code = apiRespBuilder.code;
    this.msg = apiRespBuilder.msg;
    this.resultDTO = apiRespBuilder.resultDTO;
  }

  public static <T> ApiRespBuilder<T> builder() {
    return new ApiRespBuilder<>();
  }

  public static class ApiRespBuilder<T> {
    private String code;
    private String msg;
    private ResultDTO resultDTO;

    public ApiRespBuilder<T> success() {
      this.code = SysCode.SUCCESS.getCode();
      this.msg = SysCode.SUCCESS.getDesc();
      return this;
    }

    public ApiRespBuilder<T> fail(SysCode syscode) {
      this.code = syscode.getCode();
      this.msg = syscode.getDesc();
      return this;
    }

    public ApiRespBuilder<T> resultDTO(ResultDTO resultDTO) {
      this.resultDTO = resultDTO;
      return this;
    }

    public ApiResp<T> build() {
      return new ApiResp<>(this);
    }
  }
}
