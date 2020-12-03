package com.sample.common.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.35.0" }, date = "2020-12-03T23:00:18.628+0900")
public final class _User extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.sample.common.entity.User> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.35.0");
    }

    private static final _User __singleton = new _User();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.sample.common.entity.User>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.User, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.User, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.User, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.sample.common.entity.User, ?>> __embeddedPropertyTypeMap;

    private _User() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = true;
        __name = "User";
        __catalogName = "";
        __schemaName = "";
        __tableName = "user";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.User, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.User, ?>> __list = new java.util.ArrayList<>(8);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.User, ?>> __map = new java.util.LinkedHashMap<>(8);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.sample.common.entity.User, ?>> __embeddedMap = new java.util.LinkedHashMap<>(8);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.User, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.sample.common.entity.User, ?>> __embeddedMap) {
        __map.put("userId", new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<com.sample.common.entity.User, java.lang.String, java.lang.String>(com.sample.common.entity.User.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "userId", "user_id", __namingType, false));
        __map.put("password", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.User, java.lang.String, java.lang.String>(com.sample.common.entity.User.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "password", "password", __namingType, true, true, false));
        __map.put("name", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.User, java.lang.String, java.lang.String>(com.sample.common.entity.User.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "name", "name", __namingType, true, true, false));
        __map.put("deleteFlg", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.User, java.lang.Integer, java.lang.Integer>(com.sample.common.entity.User.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.IntegerWrapper()), "deleteFlg", "is_delete", __namingType, true, true, false));
        __map.put("createId", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.User, java.lang.String, java.lang.String>(com.sample.common.entity.User.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "createId", "create_id", __namingType, true, true, false));
        __map.put("updateId", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.User, java.lang.String, java.lang.String>(com.sample.common.entity.User.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "updateId", "update_id", __namingType, true, true, false));
        __map.put("createDateTime", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.User, java.time.LocalDateTime, java.time.LocalDateTime>(com.sample.common.entity.User.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.LocalDateTimeWrapper()), "createDateTime", "create_date_time", __namingType, true, true, false));
        __map.put("updateDateTime", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.sample.common.entity.User, java.time.LocalDateTime, java.time.LocalDateTime>(com.sample.common.entity.User.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.LocalDateTimeWrapper()), "updateDateTime", "update_date_time", __namingType, true, true, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.User, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.User, ?>> __idList) {
        __idList.add(__map.get("userId"));
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.User, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.User, ?>> __list) {
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
    public void preInsert(com.sample.common.entity.User entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.sample.common.entity.User> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.sample.common.entity.User entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.sample.common.entity.User> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.sample.common.entity.User entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.sample.common.entity.User> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.sample.common.entity.User entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.sample.common.entity.User> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.sample.common.entity.User entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.sample.common.entity.User> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.sample.common.entity.User entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.sample.common.entity.User> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.User, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.User, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.sample.common.entity.User, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.sample.common.entity.User, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.sample.common.entity.User, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<com.sample.common.entity.User, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<com.sample.common.entity.User, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.sample.common.entity.User, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.sample.common.entity.User, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public com.sample.common.entity.User newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.sample.common.entity.User, ?>> __args) {
        return new com.sample.common.entity.User(
            (java.lang.String)(__args.get("userId") != null ? __args.get("userId").get() : null),
            (java.lang.String)(__args.get("password") != null ? __args.get("password").get() : null),
            (java.lang.String)(__args.get("name") != null ? __args.get("name").get() : null),
            (java.lang.Integer)(__args.get("deleteFlg") != null ? __args.get("deleteFlg").get() : null),
            (java.lang.String)(__args.get("createId") != null ? __args.get("createId").get() : null),
            (java.lang.String)(__args.get("updateId") != null ? __args.get("updateId").get() : null),
            (java.time.LocalDateTime)(__args.get("createDateTime") != null ? __args.get("createDateTime").get() : null),
            (java.time.LocalDateTime)(__args.get("updateDateTime") != null ? __args.get("updateDateTime").get() : null));
    }

    @Override
    public Class<com.sample.common.entity.User> getEntityClass() {
        return com.sample.common.entity.User.class;
    }

    @Override
    public com.sample.common.entity.User getOriginalStates(com.sample.common.entity.User __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.sample.common.entity.User __entity) {
    }

    /**
     * @return the singleton
     */
    public static _User getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _User newInstance() {
        return new _User();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<com.sample.common.entity.User> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
