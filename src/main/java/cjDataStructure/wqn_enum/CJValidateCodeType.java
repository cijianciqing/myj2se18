/**
 * 
 */
package cjDataStructure.wqn_enum;


/**
 * 
 * 校验码类型
 * 
 * @author zhailiang
 *
 */
public enum CJValidateCodeType {
	
	/**
	 * 短信验证码
	 */
	SMS {
		@Override
		public String getParamNameOnValidate() {
			return "cjSms";
		}
	},
	/**
	 * 图片验证码
	 */
	IMAGE {
		@Override
		public String getParamNameOnValidate() {
			return "cjImage";
		}
	};

	/**
	 * 校验时从请求中获取的参数的名字
	 * @return
	 */
	public abstract String getParamNameOnValidate();

}
