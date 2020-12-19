package com.sample.common.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.35.0" }, date = "2020-12-19T18:07:53.559+0900")
public class LoginDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.sample.common.dao.LoginDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.35.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.common.dao.LoginDao.class, "selectLoginUserByUserId", java.lang.String.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public LoginDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public com.sample.common.entity.User selectLoginUserByUserId(java.lang.String userId) {
        entering("com.sample.common.dao.LoginDaoImpl", "selectLoginUserByUserId", userId);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sample/common/dao/LoginDao/selectLoginUserByUserId.sql");
            __query.setEntityType(com.sample.common.entity._User.getSingletonInternal());
            __query.addParameter("userId", java.lang.String.class, userId);
            __query.setCallerClassName("com.sample.common.dao.LoginDaoImpl");
            __query.setCallerMethodName("selectLoginUserByUserId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<com.sample.common.entity.User> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.sample.common.entity.User>(com.sample.common.entity._User.getSingletonInternal()));
            com.sample.common.entity.User __result = __command.execute();
            __query.complete();
            exiting("com.sample.common.dao.LoginDaoImpl", "selectLoginUserByUserId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.common.dao.LoginDaoImpl", "selectLoginUserByUserId", __e);
            throw __e;
        }
    }

}
