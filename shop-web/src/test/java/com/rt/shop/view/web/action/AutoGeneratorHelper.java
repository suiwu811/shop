package com.rt.shop.view.web.action;

import com.baomidou.kisso.common.util.EnvUtil;
import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.ConfigGenerator;

/**
 * 
 * 自动生成映射工具类
 * 
 * @author hubin
 *
 */
public class AutoGeneratorHelper {

	/**
	 * 
	 * 测试 run 执行
	 * 
	 * <p>
	 * 配置方法查看 {@link ConfigGenerator}
	 * </p>
	 * 
	 */
	public static void main( String[] args ) {
		ConfigGenerator cg = new ConfigGenerator();
		cg.setEntityPackage("com.rt.sys.entity");
		cg.setMapperPackage("com.rt.sys.mapper");
		cg.setServicePackage("com.rt.sys.service");
		cg.setSuperServiceImpl("com.rt.sys.service.impl.support.BaseServiceImpl");
		cg.setIdType(IdType.ID_WORKER);
		if (EnvUtil.isLinux()) {
			cg.setSaveDir("/Users/hubin/springwind/");
		} else {
			cg.setSaveDir("C:/logs/");
		}
//		String[] tables = new String[]{"shopping_pv"};
//		cg.setTableNames(tables);
		cg.setDbDriverName("com.mysql.jdbc.Driver");
		cg.setDbUser("root");
		cg.setDbPassword("root");
		cg.setDbUrl("jdbc:mysql://127.0.0.1:3306/test?characterEncoding=utf8");
		cg.setDbPrefix(false);
		AutoGenerator.run(cg);
	}
	
}
