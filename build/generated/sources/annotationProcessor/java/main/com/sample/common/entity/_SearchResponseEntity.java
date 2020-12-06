package com.sample.common.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.35.0" }, date = "2020-12-06T20:29:08.522+0900")
public final class _SearchResponseEntity extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.sample.common.entity.SearchResponseEntity> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.35.0");
    }

    private static final _SearchResponseEntity __singleton = new _SearchResponseEntity();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.sample.common.entity.SearchResponseEntity>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.SearchResponseEntity, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.SearchResponseEntity, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.SearchResponseEntity, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.sample.common.entity.SearchResponseEntity, ?>> __embeddedPropertyTypeMap;

    private _SearchResponseEntity() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "SearchResponseEntity";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.SearchResponseEntity, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.SearchResponseEntity, ?>> __list = new java.util.ArrayList<>(6);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.SearchResponseEntity, ?>> __map = new java.util.LinkedHashMap<>(6);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.sample.common.entity.SearchResponseEntity, ?>> __embeddedMap = new java.util.LinkedHashMap<>(6);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.SearchResponseEntity, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.sample.common.entity.SearchResponseEntity, ?>> __embeddedMap) {
        __map.put("id", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.SearchResponseEntity, java.lang.Integer, java.lang.Integer>(com.sample.common.entity.SearchResponseEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.IntegerWrapper()), "id", "", __namingType, true, true, false));
        __map.put("title", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.SearchResponseEntity, java.lang.String, java.lang.String>(com.sample.common.entity.SearchResponseEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "title", "", __namingType, true, true, false));
        __map.put("overview", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.SearchResponseEntity, java.lang.String, java.lang.String>(com.sample.common.entity.SearchResponseEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "overview", "", __namingType, true, true, false));
        __map.put("displayStartDate", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.SearchResponseEntity, java.time.LocalDate, java.time.LocalDate>(com.sample.common.entity.SearchResponseEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.LocalDateWrapper()), "displayStartDate", "display_start_date", __namingType, true, true, false));
        __map.put("displayEndDate", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.SearchResponseEntity, java.time.LocalDate, java.time.LocalDate>(com.sample.common.entity.SearchResponseEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.LocalDateWrapper()), "displayEndDate", "display_end_date", __namingType, true, true, false));
        __map.put("createDateTime", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.SearchResponseEntity, java.time.LocalDateTime, java.time.LocalDateTime>(com.sample.common.entity.SearchResponseEntity.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.LocalDateTimeWrapper()), "createDateTime", "create_date_time", __namingType, true, true, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.SearchResponseEntity, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.SearchResponseEntity, ?>> __idList) {
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.SearchResponseEntity, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.SearchResponseEntity, ?>> __list) {
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
    public void preInsert(com.sample.common.entity.SearchResponseEntity entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.sample.common.entity.SearchResponseEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.sample.common.entity.SearchResponseEntity entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.sample.common.entity.SearchResponseEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.sample.common.entity.SearchResponseEntity entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.sample.common.entity.SearchResponseEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.sample.common.entity.SearchResponseEntity entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.sample.common.entity.SearchResponseEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.sample.common.entity.SearchResponseEntity entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.sample.common.entity.SearchResponseEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.sample.common.entity.SearchResponseEntity entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.sample.common.entity.SearchResponseEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.SearchResponseEntity, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.SearchResponseEntity, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.SearchResponseEntity, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.sample.common.entity.SearchResponseEntity, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.sample.common.entity.SearchResponseEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<com.sample.common.entity.SearchResponseEntity, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<com.sample.common.entity.SearchResponseEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.sample.common.entity.SearchResponseEntity, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.sample.common.entity.SearchResponseEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public com.sample.common.entity.SearchResponseEntity newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.sample.common.entity.SearchResponseEntity, ?>> __args) {
        com.sample.common.entity.SearchResponseEntity entity = new com.sample.common.entity.SearchResponseEntity();
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("title") != null) __args.get("title").save(entity);
        if (__args.get("overview") != null) __args.get("overview").save(entity);
        if (__args.get("displayStartDate") != null) __args.get("displayStartDate").save(entity);
        if (__args.get("displayEndDate") != null) __args.get("displayEndDate").save(entity);
        if (__args.get("createDateTime") != null) __args.get("createDateTime").save(entity);
        return entity;
    }

    @Override
    public Class<com.sample.common.entity.SearchResponseEntity> getEntityClass() {
        return com.sample.common.entity.SearchResponseEntity.class;
    }

    @Override
    public com.sample.common.entity.SearchResponseEntity getOriginalStates(com.sample.common.entity.SearchResponseEntity __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.sample.common.entity.SearchResponseEntity __entity) {
    }

    /**
     * @return the singleton
     */
    public static _SearchResponseEntity getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _SearchResponseEntity newInstance() {
        return new _SearchResponseEntity();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<com.sample.common.entity.SearchResponseEntity> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
