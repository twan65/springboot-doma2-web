package com.sample.common.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.35.0" }, date = "2020-12-14T21:27:27.673+0900")
public class InformationDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.sample.common.dao.InformationDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.35.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.common.dao.InformationDao.class, "insertInformation", com.sample.common.entity.InformationEntity.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.common.dao.InformationDao.class, "countSearchTargetBy", com.sample.common.entity.SearchEntity.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.sample.common.dao.InformationDao.class, "selectInformationListBy", com.sample.common.entity.SearchEntity.class, org.seasar.doma.jdbc.SelectOptions.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public InformationDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public int insertInformation(com.sample.common.entity.InformationEntity entity) {
        entering("com.sample.common.dao.InformationDaoImpl", "insertInformation", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.AutoInsertQuery<com.sample.common.entity.InformationEntity> __query = getQueryImplementors().createAutoInsertQuery(__method0, com.sample.common.entity._InformationEntity.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setEntity(entity);
            __query.setCallerClassName("com.sample.common.dao.InformationDaoImpl");
            __query.setCallerMethodName("insertInformation");
            __query.setQueryTimeout(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.jdbc.command.InsertCommand __command = getCommandImplementors().createInsertCommand(__method0, __query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.sample.common.dao.InformationDaoImpl", "insertInformation", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.common.dao.InformationDaoImpl", "insertInformation", __e);
            throw __e;
        }
    }

    @Override
    public java.lang.Integer countSearchTargetBy(com.sample.common.entity.SearchEntity entity) {
        entering("com.sample.common.dao.InformationDaoImpl", "countSearchTargetBy", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method1);
            __query.setMethod(__method1);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sample/common/dao/InformationDao/countSearchTargetBy.sql");
            __query.addParameter("entity", com.sample.common.entity.SearchEntity.class, entity);
            __query.setCallerClassName("com.sample.common.dao.InformationDaoImpl");
            __query.setCallerMethodName("countSearchTargetBy");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.lang.Integer> __command = getCommandImplementors().createSelectCommand(__method1, __query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.Integer>(org.seasar.doma.wrapper.IntegerWrapper::new));
            java.lang.Integer __result = __command.execute();
            __query.complete();
            exiting("com.sample.common.dao.InformationDaoImpl", "countSearchTargetBy", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.common.dao.InformationDaoImpl", "countSearchTargetBy", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.sample.common.entity.SearchResponseEntity> selectInformationListBy(com.sample.common.entity.SearchEntity entity, org.seasar.doma.jdbc.SelectOptions options) {
        entering("com.sample.common.dao.InformationDaoImpl", "selectInformationListBy", entity, options);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            if (options == null) {
                throw new org.seasar.doma.DomaNullPointerException("options");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method2);
            __query.setMethod(__method2);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/sample/common/dao/InformationDao/selectInformationListBy.sql");
            __query.setOptions(options);
            __query.setEntityType(com.sample.common.entity._SearchResponseEntity.getSingletonInternal());
            __query.addParameter("entity", com.sample.common.entity.SearchEntity.class, entity);
            __query.setCallerClassName("com.sample.common.dao.InformationDaoImpl");
            __query.setCallerMethodName("selectInformationListBy");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<com.sample.common.entity.SearchResponseEntity>> __command = getCommandImplementors().createSelectCommand(__method2, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.sample.common.entity.SearchResponseEntity>(com.sample.common.entity._SearchResponseEntity.getSingletonInternal()));
            java.util.List<com.sample.common.entity.SearchResponseEntity> __result = __command.execute();
            __query.complete();
            exiting("com.sample.common.dao.InformationDaoImpl", "selectInformationListBy", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.sample.common.dao.InformationDaoImpl", "selectInformationListBy", __e);
            throw __e;
        }
    }

}
