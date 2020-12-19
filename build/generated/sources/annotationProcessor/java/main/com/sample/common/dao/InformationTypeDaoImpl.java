package com.sample.common.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.35.0" }, date = "2020-12-19T18:07:53.632+0900")
public class InformationTypeDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.sample.common.dao.InformationTypeDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.35.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.common.dao.InformationTypeDao.class, "insertInformationType", com.sample.common.entity.InformationTypeEntity.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.common.dao.InformationTypeDao.class, "deleteBy", java.lang.Integer.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.common.dao.InformationTypeDao.class, "selectInformationTypeListBy", java.lang.Integer.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public InformationTypeDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public int insertInformationType(com.sample.common.entity.InformationTypeEntity entity) {
        entering("com.sample.common.dao.InformationTypeDaoImpl", "insertInformationType", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<com.sample.common.entity.InformationTypeEntity> __query = getQueryImplementors().createAutoInsertQuery(__method0, com.sample.common.entity._InformationTypeEntity.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("com.sample.common.dao.InformationTypeDaoImpl");
            __query.setCallerMethodName("insertInformationType");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method0, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.sample.common.dao.InformationTypeDaoImpl", "insertInformationType", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.common.dao.InformationTypeDaoImpl", "insertInformationType", __e);
            throw __e;
        }
    }

    @Override
    public int deleteBy(java.lang.Integer informationId) {
        entering("com.sample.common.dao.InformationTypeDaoImpl", "deleteBy", informationId);
        try {
            org.seasar.doma.jdbc.query.SqlFileDeleteQuery __query = getQueryImplementors().createSqlFileDeleteQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sample/common/dao/InformationTypeDao/deleteBy.sql");
            __query.addParameter("informationId", java.lang.Integer.class, informationId);
            __query.setCallerClassName("com.sample.common.dao.InformationTypeDaoImpl");
            __query.setCallerMethodName("deleteBy");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.jdbc.command.DeleteCommand __command = getCommandImplementors().createDeleteCommand(__method1, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.sample.common.dao.InformationTypeDaoImpl", "deleteBy", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.common.dao.InformationTypeDaoImpl", "deleteBy", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<java.lang.Integer> selectInformationTypeListBy(java.lang.Integer informationId) {
        entering("com.sample.common.dao.InformationTypeDaoImpl", "selectInformationTypeListBy", informationId);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sample/common/dao/InformationTypeDao/selectInformationTypeListBy.sql");
            __query.addParameter("informationId", java.lang.Integer.class, informationId);
            __query.setCallerClassName("com.sample.common.dao.InformationTypeDaoImpl");
            __query.setCallerMethodName("selectInformationTypeListBy");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<java.lang.Integer>> __command = getCommandImplementors().createSelectCommand(__method2, __query, new org.seasar.doma.internal.jdbc.command.BasicResultListHandler<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new));
            java.util.List<java.lang.Integer> __result = __command.execute();
            __query.complete();
            exiting("com.sample.common.dao.InformationTypeDaoImpl", "selectInformationTypeListBy", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.common.dao.InformationTypeDaoImpl", "selectInformationTypeListBy", __e);
            throw __e;
        }
    }

}
