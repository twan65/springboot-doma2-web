package com.sample.common.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.35.0" }, date = "2020-12-09T21:30:32.239+0900")
public final class _InformationTypeEntity extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.sample.common.entity.InformationTypeEntity> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.35.0");
    }

    private static final _InformationTypeEntity __singleton = new _InformationTypeEntity();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.sample.common.entity.InformationTypeEntity>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationTypeEntity, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationTypeEntity, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationTypeEntity, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.sample.common.entity.InformationTypeEntity, ?>> __embeddedPropertyTypeMap;

    private _InformationTypeEntity() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "InformationTypeEntity";
        __catalogName = "";
        __schemaName = "";
        __tableName = "information_type";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationTypeEntity, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationTypeEntity, ?>> __list = new java.util.ArrayList<>(6);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationTypeEntity, ?>> __map = new java.util.LinkedHashMap<>(6);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.sample.common.entity.InformationTypeEntity, ?>> __embeddedMap = new java.util.LinkedHashMap<>(6);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationTypeEntity, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.sample.common.entity.InformationTypeEntity, ?>> __embeddedMap) {
        __map.put("tableId", new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<com.sample.common.entity.InformationTypeEntity, java.lang.Long, java.lang.Long>(com.sample.common.entity.InformationTypeEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.PrimitiveLongWrapper()), "tableId", "information_type_id", __namingType, false));
        __map.put("informationType", new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<com.sample.common.entity.InformationTypeEntity, java.lang.Integer, java.lang.Integer>(com.sample.common.entity.InformationTypeEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.IntegerWrapper()), "informationType", "information_type", __namingType, false));
        __map.put("createId", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.InformationTypeEntity, java.lang.String, java.lang.String>(com.sample.common.entity.InformationTypeEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "createId", "create_id", __namingType, true, true, false));
        __map.put("updateId", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.InformationTypeEntity, java.lang.String, java.lang.String>(com.sample.common.entity.InformationTypeEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "updateId", "update_id", __namingType, true, true, false));
        __map.put("createDateTime", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.InformationTypeEntity, java.time.LocalDateTime, java.time.LocalDateTime>(com.sample.common.entity.InformationTypeEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.LocalDateTimeWrapper()), "createDateTime", "create_date_time", __namingType, true, true, false));
        __map.put("updateDateTime", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.InformationTypeEntity, java.time.LocalDateTime, java.time.LocalDateTime>(com.sample.common.entity.InformationTypeEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.LocalDateTimeWrapper()), "updateDateTime", "update_date_time", __namingType, true, true, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationTypeEntity, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationTypeEntity, ?>> __idList) {
        __idList.add(__map.get("tableId"));
        __idList.add(__map.get("informationType"));
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationTypeEntity, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationTypeEntity, ?>> __list) {
        __list.addAll(__map.values());
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(com.sample.common.entity.InformationTypeEntity entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.sample.common.entity.InformationTypeEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.sample.common.entity.InformationTypeEntity entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.sample.common.entity.InformationTypeEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.sample.common.entity.InformationTypeEntity entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.sample.common.entity.InformationTypeEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.sample.common.entity.InformationTypeEntity entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.sample.common.entity.InformationTypeEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.sample.common.entity.InformationTypeEntity entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.sample.common.entity.InformationTypeEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.sample.common.entity.InformationTypeEntity entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.sample.common.entity.InformationTypeEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationTypeEntity, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationTypeEntity, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationTypeEntity, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.sample.common.entity.InformationTypeEntity, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.sample.common.entity.InformationTypeEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<com.sample.common.entity.InformationTypeEntity, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<com.sample.common.entity.InformationTypeEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.sample.common.entity.InformationTypeEntity, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.sample.common.entity.InformationTypeEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public com.sample.common.entity.InformationTypeEntity newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.sample.common.entity.InformationTypeEntity, ?>> __args) {
        com.sample.common.entity.InformationTypeEntity entity = new com.sample.common.entity.InformationTypeEntity();
        if (__args.get("tableId") != null) __args.get("tableId").save(entity);
        if (__args.get("informationType") != null) __args.get("informationType").save(entity);
        if (__args.get("createId") != null) __args.get("createId").save(entity);
        if (__args.get("updateId") != null) __args.get("updateId").save(entity);
        if (__args.get("createDateTime") != null) __args.get("createDateTime").save(entity);
        if (__args.get("updateDateTime") != null) __args.get("updateDateTime").save(entity);
        return entity;
    }

    @Override
    public Class<com.sample.common.entity.InformationTypeEntity> getEntityClass() {
        return com.sample.common.entity.InformationTypeEntity.class;
    }

    @Override
    public com.sample.common.entity.InformationTypeEntity getOriginalStates(com.sample.common.entity.InformationTypeEntity __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.sample.common.entity.InformationTypeEntity __entity) {
    }

    /**
     * @return the singleton
     */
    public static _InformationTypeEntity getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _InformationTypeEntity newInstance() {
        return new _InformationTypeEntity();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<com.sample.common.entity.InformationTypeEntity> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
