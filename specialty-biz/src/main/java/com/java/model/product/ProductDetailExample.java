package com.java.model.product;

import java.util.ArrayList;
import java.util.List;

public class ProductDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andOriginAddressIsNull() {
            addCriterion("origin_address is null");
            return (Criteria) this;
        }

        public Criteria andOriginAddressIsNotNull() {
            addCriterion("origin_address is not null");
            return (Criteria) this;
        }

        public Criteria andOriginAddressEqualTo(String value) {
            addCriterion("origin_address =", value, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressNotEqualTo(String value) {
            addCriterion("origin_address <>", value, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressGreaterThan(String value) {
            addCriterion("origin_address >", value, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressGreaterThanOrEqualTo(String value) {
            addCriterion("origin_address >=", value, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressLessThan(String value) {
            addCriterion("origin_address <", value, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressLessThanOrEqualTo(String value) {
            addCriterion("origin_address <=", value, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressLike(String value) {
            addCriterion("origin_address like", value, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressNotLike(String value) {
            addCriterion("origin_address not like", value, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressIn(List<String> values) {
            addCriterion("origin_address in", values, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressNotIn(List<String> values) {
            addCriterion("origin_address not in", values, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressBetween(String value1, String value2) {
            addCriterion("origin_address between", value1, value2, "originAddress");
            return (Criteria) this;
        }

        public Criteria andOriginAddressNotBetween(String value1, String value2) {
            addCriterion("origin_address not between", value1, value2, "originAddress");
            return (Criteria) this;
        }

        public Criteria andRawMaterialIsNull() {
            addCriterion("raw_material is null");
            return (Criteria) this;
        }

        public Criteria andRawMaterialIsNotNull() {
            addCriterion("raw_material is not null");
            return (Criteria) this;
        }

        public Criteria andRawMaterialEqualTo(String value) {
            addCriterion("raw_material =", value, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialNotEqualTo(String value) {
            addCriterion("raw_material <>", value, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialGreaterThan(String value) {
            addCriterion("raw_material >", value, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("raw_material >=", value, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialLessThan(String value) {
            addCriterion("raw_material <", value, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialLessThanOrEqualTo(String value) {
            addCriterion("raw_material <=", value, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialLike(String value) {
            addCriterion("raw_material like", value, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialNotLike(String value) {
            addCriterion("raw_material not like", value, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialIn(List<String> values) {
            addCriterion("raw_material in", values, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialNotIn(List<String> values) {
            addCriterion("raw_material not in", values, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialBetween(String value1, String value2) {
            addCriterion("raw_material between", value1, value2, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andRawMaterialNotBetween(String value1, String value2) {
            addCriterion("raw_material not between", value1, value2, "rawMaterial");
            return (Criteria) this;
        }

        public Criteria andStandardCodeIsNull() {
            addCriterion("standard_code is null");
            return (Criteria) this;
        }

        public Criteria andStandardCodeIsNotNull() {
            addCriterion("standard_code is not null");
            return (Criteria) this;
        }

        public Criteria andStandardCodeEqualTo(String value) {
            addCriterion("standard_code =", value, "standardCode");
            return (Criteria) this;
        }

        public Criteria andStandardCodeNotEqualTo(String value) {
            addCriterion("standard_code <>", value, "standardCode");
            return (Criteria) this;
        }

        public Criteria andStandardCodeGreaterThan(String value) {
            addCriterion("standard_code >", value, "standardCode");
            return (Criteria) this;
        }

        public Criteria andStandardCodeGreaterThanOrEqualTo(String value) {
            addCriterion("standard_code >=", value, "standardCode");
            return (Criteria) this;
        }

        public Criteria andStandardCodeLessThan(String value) {
            addCriterion("standard_code <", value, "standardCode");
            return (Criteria) this;
        }

        public Criteria andStandardCodeLessThanOrEqualTo(String value) {
            addCriterion("standard_code <=", value, "standardCode");
            return (Criteria) this;
        }

        public Criteria andStandardCodeLike(String value) {
            addCriterion("standard_code like", value, "standardCode");
            return (Criteria) this;
        }

        public Criteria andStandardCodeNotLike(String value) {
            addCriterion("standard_code not like", value, "standardCode");
            return (Criteria) this;
        }

        public Criteria andStandardCodeIn(List<String> values) {
            addCriterion("standard_code in", values, "standardCode");
            return (Criteria) this;
        }

        public Criteria andStandardCodeNotIn(List<String> values) {
            addCriterion("standard_code not in", values, "standardCode");
            return (Criteria) this;
        }

        public Criteria andStandardCodeBetween(String value1, String value2) {
            addCriterion("standard_code between", value1, value2, "standardCode");
            return (Criteria) this;
        }

        public Criteria andStandardCodeNotBetween(String value1, String value2) {
            addCriterion("standard_code not between", value1, value2, "standardCode");
            return (Criteria) this;
        }

        public Criteria andLicenseCodeIsNull() {
            addCriterion("license_code is null");
            return (Criteria) this;
        }

        public Criteria andLicenseCodeIsNotNull() {
            addCriterion("license_code is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseCodeEqualTo(String value) {
            addCriterion("license_code =", value, "licenseCode");
            return (Criteria) this;
        }

        public Criteria andLicenseCodeNotEqualTo(String value) {
            addCriterion("license_code <>", value, "licenseCode");
            return (Criteria) this;
        }

        public Criteria andLicenseCodeGreaterThan(String value) {
            addCriterion("license_code >", value, "licenseCode");
            return (Criteria) this;
        }

        public Criteria andLicenseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("license_code >=", value, "licenseCode");
            return (Criteria) this;
        }

        public Criteria andLicenseCodeLessThan(String value) {
            addCriterion("license_code <", value, "licenseCode");
            return (Criteria) this;
        }

        public Criteria andLicenseCodeLessThanOrEqualTo(String value) {
            addCriterion("license_code <=", value, "licenseCode");
            return (Criteria) this;
        }

        public Criteria andLicenseCodeLike(String value) {
            addCriterion("license_code like", value, "licenseCode");
            return (Criteria) this;
        }

        public Criteria andLicenseCodeNotLike(String value) {
            addCriterion("license_code not like", value, "licenseCode");
            return (Criteria) this;
        }

        public Criteria andLicenseCodeIn(List<String> values) {
            addCriterion("license_code in", values, "licenseCode");
            return (Criteria) this;
        }

        public Criteria andLicenseCodeNotIn(List<String> values) {
            addCriterion("license_code not in", values, "licenseCode");
            return (Criteria) this;
        }

        public Criteria andLicenseCodeBetween(String value1, String value2) {
            addCriterion("license_code between", value1, value2, "licenseCode");
            return (Criteria) this;
        }

        public Criteria andLicenseCodeNotBetween(String value1, String value2) {
            addCriterion("license_code not between", value1, value2, "licenseCode");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}