package com.w77996.ssm_jdbctemplate.controller;


import org.springframework.stereotype.Controller;

@Controller
public class BaseController {

	/*@Autowired
	protected ITokenInfoService tokenInfoService;

	private Logger logger = LoggerFactory.getLogger(getClass());

	protected Long checkTokenAndUser(String token) {
		if (StringUtils.isEmpty(token)) {
			throw new BizException(RespCode.U_TOKEN_ERR);
		}
		Long user_id = tokenInfoService.getUserIdByToken(token);
		if (user_id == null) {
			logger.info("[checkTokenAndUser] 通过token检查userid不存在，token:" + token);
			throw new BizException(RespCode.U_TOKEN_ERR);
		}
		return user_id;
	}*/

}
