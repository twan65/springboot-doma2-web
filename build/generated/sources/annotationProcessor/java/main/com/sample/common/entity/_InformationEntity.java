package com.sample.common.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.35.0" }, date = "2020-12-16T20:57:18.839+0900")
public final class _InformationEntity extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.sample.common.entity.InformationEntity> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.35.0");
    }

    private static final _InformationEntity __singleton = new _InformationEntity();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.sample.common.entity.InformationEntity>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationEntity, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationEntity, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationEntity, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.sample.common.entity.InformationEntity, ?>> __embeddedPropertyTypeMap;

    private _InformationEntity() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "InformationEntity";
        __catalogName = "";
        __schemaName = "";
        __tableName = "information";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationEntity, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationEntity, ?>> __list = new java.util.ArrayList<>(10);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationEntity, ?>> __map = new java.util.LinkedHashMap<>(10);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.sample.common.entity.InformationEntity, ?>> __embeddedMap = new java.util.LinkedHashMap<>(10);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationEntity, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.sample.common.entity.InformationEntity, ?>> __embeddedMap) {
        __map.put("id", new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.sample.common.entity.InformationEntity, java.lang.Integer, java.lang.Integer>(com.sample.common.entity.InformationEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.IntegerWrapper()), "id", "", __namingType, false, __idGenerator));
        __map.put("title", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.InformationEntity, java.lang.String, java.lang.String>(com.sample.common.entity.InformationEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "title", "", __namingType, true, true, false));
        __map.put("overview", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.InformationEntity, java.lang.String, java.lang.String>(com.sample.common.entity.InformationEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "overview", "", __namingType, true, true, false));
        __map.put("displayStartDate", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.InformationEntity, java.time.LocalDate, java.time.LocalDate>(com.sample.common.entity.InformationEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.LocalDateWrapper()), "displayStartDate", "display_start_date", __namingType, true, true, false));
        __map.put("displayEndDate", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.InformationEntity, java.time.LocalDate, java.time.LocalDate>(com.sample.common.entity.InformationEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.LocalDateWrapper()), "displayEndDate", "display_end_date", __namingType, true, true, false));
        __map.put("isDelete", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.InformationEntity, java.lang.Long, java.lang.Long>(com.sample.common.entity.InformationEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.PrimitiveLongWrapper()), "isDelete", "is_delete", __namingType, true, true, false));
        __map.put("createId", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.InformationEntity, java.lang.String, java.lang.String>(com.sample.common.entity.InformationEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "createId", "create_id", __namingType, true, true, false));
        __map.put("updateId", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.InformationEntity, java.lang.String, java.lang.String>(com.sample.common.entity.InformationEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "updateId", "update_id", __namingType, true, true, false));
        __map.put("createDateTime", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.InformationEntity, java.time.LocalDateTime, java.time.LocalDateTime>(com.sample.common.entity.InformationEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.LocalDateTimeWrapper()), "createDateTime", "create_date_time", __namingType, true, true, false));
        __map.put("updateDateTime", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.InformationEntity, java.time.LocalDateTime, java.time.LocalDateTime>(com.sample.common.entity.InformationEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.LocalDateTimeWrapper()), "updateDateTime", "update_date_time", __namingType, true, true, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationEntity, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationEntity, ?>> __idList) {
        __idList.add(__map.get("id"));
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationEntity, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationEntity, ?>> __list) {
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
    public void preInsert(com.sample.common.entity.InformationEntity entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.sample.common.entity.InformationEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.sample.common.entity.InformationEntity entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.sample.common.entity.InformationEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.sample.common.entity.InformationEntity entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.sample.common.entity.InformationEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.sample.common.entity.InformationEntity entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.sample.common.entity.InformationEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.sample.common.entity.InformationEntity entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.sample.common.entity.InformationEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.sample.common.entity.InformationEntity entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.sample.common.entity.InformationEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationEntity, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationEntity, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.InformationEntity, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.sample.common.entity.InformationEntity, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.sample.common.entity.InformationEntity, ?, ?>)__entityPropertyTypeMap.get("id");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<com.sample.common.entity.InformationEntity, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<com.sample.common.entity.InformationEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.sample.common.entity.InformationEntity, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.sample.common.entity.InformationEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public com.sample.common.entity.InformationEntity newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.sample.common.entity.InformationEntity, ?>> __args) {
        com.sample.common.entity.InformationEntity entity = new com.sample.common.entity.InformationEntity();
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("title") != null) __args.get("title").save(entity);
        if (__args.get("overview") != null) __args.get("overview").save(entity);
        if (__args.get("displayStartDate") != null) __args.get("displayStartDate").save(entity);
        if (__args.get("displayEndDate") != null) __args.get("displayEndDate").save(entity);
        if (__args.get("isDelete") != null) __args.get("isDelete").save(entity);
        if (__args.get("createId") != null) __args.get("createId").save(entity);
        if (__args.get("updateId") != null) __args.get("updateId").save(entity);
        if (__args.get("createDateTime") != null) __args.get("createDateTime").save(entity);
        if (__args.get("updateDateTime") != null) __args.get("updateDateTime").save(entity);
        return entity;
    }

    @Override
    public Class<com.sample.common.entity.InformationEntity> getEntityClass() {
        return com.sample.common.entity.InformationEntity.class;
    }

    @Override
    public com.sample.common.entity.InformationEntity getOriginalStates(com.sample.common.entity.InformationEntity __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.sample.common.entity.InformationEntity __entity) {
    }

    /**
     * @return the singleton
     */
    public static _InformationEntity getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _InformationEntity newInstance() {
        return new _InformationEntity();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<com.sample.common.entity.InformationEntity> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
