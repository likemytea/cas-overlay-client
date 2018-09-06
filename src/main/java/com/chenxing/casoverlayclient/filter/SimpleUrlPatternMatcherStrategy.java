package com.chenxing.casoverlayclient.filter;

import org.jasig.cas.client.authentication.UrlPatternMatcherStrategy;

/**
 * 用于过滤不需要登录的url，需要实现UrlPatternMatcherStrategy 接口，在matches 添加不需要用户登录的类
 */
public class SimpleUrlPatternMatcherStrategy implements UrlPatternMatcherStrategy {

	@Override
	public boolean matches(String url) {
		// 当含有loginout的字段，就可以不用登录了
		return url.contains("/loginOut/success");
	}

	/**
	 * 正则表达式的规则，这个地方可以是web传递过来的
	 */
	@Override
	public void setPattern(String pattern) {
		// TODO Auto-generated method stub

	}

}
