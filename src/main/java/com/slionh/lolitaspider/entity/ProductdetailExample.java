package com.slionh.lolitaspider.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductdetailExample() {
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

        public Criteria andProductidIsNull() {
            addCriterion("productId is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productId is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("productId =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("productId <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("productId >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productId >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("productId <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("productId <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("productId in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("productId not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("productId between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("productId not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andOperidIsNull() {
            addCriterion("operId is null");
            return (Criteria) this;
        }

        public Criteria andOperidIsNotNull() {
            addCriterion("operId is not null");
            return (Criteria) this;
        }

        public Criteria andOperidEqualTo(Integer value) {
            addCriterion("operId =", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidNotEqualTo(Integer value) {
            addCriterion("operId <>", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidGreaterThan(Integer value) {
            addCriterion("operId >", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidGreaterThanOrEqualTo(Integer value) {
            addCriterion("operId >=", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidLessThan(Integer value) {
            addCriterion("operId <", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidLessThanOrEqualTo(Integer value) {
            addCriterion("operId <=", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidIn(List<Integer> values) {
            addCriterion("operId in", values, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidNotIn(List<Integer> values) {
            addCriterion("operId not in", values, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidBetween(Integer value1, Integer value2) {
            addCriterion("operId between", value1, value2, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidNotBetween(Integer value1, Integer value2) {
            addCriterion("operId not between", value1, value2, "operid");
            return (Criteria) this;
        }

        public Criteria andOperdateIsNull() {
            addCriterion("operDate is null");
            return (Criteria) this;
        }

        public Criteria andOperdateIsNotNull() {
            addCriterion("operDate is not null");
            return (Criteria) this;
        }

        public Criteria andOperdateEqualTo(Date value) {
            addCriterion("operDate =", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateNotEqualTo(Date value) {
            addCriterion("operDate <>", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateGreaterThan(Date value) {
            addCriterion("operDate >", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateGreaterThanOrEqualTo(Date value) {
            addCriterion("operDate >=", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateLessThan(Date value) {
            addCriterion("operDate <", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateLessThanOrEqualTo(Date value) {
            addCriterion("operDate <=", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateIn(List<Date> values) {
            addCriterion("operDate in", values, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateNotIn(List<Date> values) {
            addCriterion("operDate not in", values, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateBetween(Date value1, Date value2) {
            addCriterion("operDate between", value1, value2, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateNotBetween(Date value1, Date value2) {
            addCriterion("operDate not between", value1, value2, "operdate");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("productName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productName not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductothernameIsNull() {
            addCriterion("productOtherName is null");
            return (Criteria) this;
        }

        public Criteria andProductothernameIsNotNull() {
            addCriterion("productOtherName is not null");
            return (Criteria) this;
        }

        public Criteria andProductothernameEqualTo(String value) {
            addCriterion("productOtherName =", value, "productothername");
            return (Criteria) this;
        }

        public Criteria andProductothernameNotEqualTo(String value) {
            addCriterion("productOtherName <>", value, "productothername");
            return (Criteria) this;
        }

        public Criteria andProductothernameGreaterThan(String value) {
            addCriterion("productOtherName >", value, "productothername");
            return (Criteria) this;
        }

        public Criteria andProductothernameGreaterThanOrEqualTo(String value) {
            addCriterion("productOtherName >=", value, "productothername");
            return (Criteria) this;
        }

        public Criteria andProductothernameLessThan(String value) {
            addCriterion("productOtherName <", value, "productothername");
            return (Criteria) this;
        }

        public Criteria andProductothernameLessThanOrEqualTo(String value) {
            addCriterion("productOtherName <=", value, "productothername");
            return (Criteria) this;
        }

        public Criteria andProductothernameLike(String value) {
            addCriterion("productOtherName like", value, "productothername");
            return (Criteria) this;
        }

        public Criteria andProductothernameNotLike(String value) {
            addCriterion("productOtherName not like", value, "productothername");
            return (Criteria) this;
        }

        public Criteria andProductothernameIn(List<String> values) {
            addCriterion("productOtherName in", values, "productothername");
            return (Criteria) this;
        }

        public Criteria andProductothernameNotIn(List<String> values) {
            addCriterion("productOtherName not in", values, "productothername");
            return (Criteria) this;
        }

        public Criteria andProductothernameBetween(String value1, String value2) {
            addCriterion("productOtherName between", value1, value2, "productothername");
            return (Criteria) this;
        }

        public Criteria andProductothernameNotBetween(String value1, String value2) {
            addCriterion("productOtherName not between", value1, value2, "productothername");
            return (Criteria) this;
        }

        public Criteria andReleasedateIsNull() {
            addCriterion("releaseDate is null");
            return (Criteria) this;
        }

        public Criteria andReleasedateIsNotNull() {
            addCriterion("releaseDate is not null");
            return (Criteria) this;
        }

        public Criteria andReleasedateEqualTo(Date value) {
            addCriterion("releaseDate =", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotEqualTo(Date value) {
            addCriterion("releaseDate <>", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateGreaterThan(Date value) {
            addCriterion("releaseDate >", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateGreaterThanOrEqualTo(Date value) {
            addCriterion("releaseDate >=", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLessThan(Date value) {
            addCriterion("releaseDate <", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLessThanOrEqualTo(Date value) {
            addCriterion("releaseDate <=", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateIn(List<Date> values) {
            addCriterion("releaseDate in", values, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotIn(List<Date> values) {
            addCriterion("releaseDate not in", values, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateBetween(Date value1, Date value2) {
            addCriterion("releaseDate between", value1, value2, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotBetween(Date value1, Date value2) {
            addCriterion("releaseDate not between", value1, value2, "releasedate");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andProductnumberIsNull() {
            addCriterion("productNumber is null");
            return (Criteria) this;
        }

        public Criteria andProductnumberIsNotNull() {
            addCriterion("productNumber is not null");
            return (Criteria) this;
        }

        public Criteria andProductnumberEqualTo(String value) {
            addCriterion("productNumber =", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberNotEqualTo(String value) {
            addCriterion("productNumber <>", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberGreaterThan(String value) {
            addCriterion("productNumber >", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberGreaterThanOrEqualTo(String value) {
            addCriterion("productNumber >=", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberLessThan(String value) {
            addCriterion("productNumber <", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberLessThanOrEqualTo(String value) {
            addCriterion("productNumber <=", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberLike(String value) {
            addCriterion("productNumber like", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberNotLike(String value) {
            addCriterion("productNumber not like", value, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberIn(List<String> values) {
            addCriterion("productNumber in", values, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberNotIn(List<String> values) {
            addCriterion("productNumber not in", values, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberBetween(String value1, String value2) {
            addCriterion("productNumber between", value1, value2, "productnumber");
            return (Criteria) this;
        }

        public Criteria andProductnumberNotBetween(String value1, String value2) {
            addCriterion("productNumber not between", value1, value2, "productnumber");
            return (Criteria) this;
        }

        public Criteria andIssuepriceIsNull() {
            addCriterion("issuePrice is null");
            return (Criteria) this;
        }

        public Criteria andIssuepriceIsNotNull() {
            addCriterion("issuePrice is not null");
            return (Criteria) this;
        }

        public Criteria andIssuepriceEqualTo(String value) {
            addCriterion("issuePrice =", value, "issueprice");
            return (Criteria) this;
        }

        public Criteria andIssuepriceNotEqualTo(String value) {
            addCriterion("issuePrice <>", value, "issueprice");
            return (Criteria) this;
        }

        public Criteria andIssuepriceGreaterThan(String value) {
            addCriterion("issuePrice >", value, "issueprice");
            return (Criteria) this;
        }

        public Criteria andIssuepriceGreaterThanOrEqualTo(String value) {
            addCriterion("issuePrice >=", value, "issueprice");
            return (Criteria) this;
        }

        public Criteria andIssuepriceLessThan(String value) {
            addCriterion("issuePrice <", value, "issueprice");
            return (Criteria) this;
        }

        public Criteria andIssuepriceLessThanOrEqualTo(String value) {
            addCriterion("issuePrice <=", value, "issueprice");
            return (Criteria) this;
        }

        public Criteria andIssuepriceLike(String value) {
            addCriterion("issuePrice like", value, "issueprice");
            return (Criteria) this;
        }

        public Criteria andIssuepriceNotLike(String value) {
            addCriterion("issuePrice not like", value, "issueprice");
            return (Criteria) this;
        }

        public Criteria andIssuepriceIn(List<String> values) {
            addCriterion("issuePrice in", values, "issueprice");
            return (Criteria) this;
        }

        public Criteria andIssuepriceNotIn(List<String> values) {
            addCriterion("issuePrice not in", values, "issueprice");
            return (Criteria) this;
        }

        public Criteria andIssuepriceBetween(String value1, String value2) {
            addCriterion("issuePrice between", value1, value2, "issueprice");
            return (Criteria) this;
        }

        public Criteria andIssuepriceNotBetween(String value1, String value2) {
            addCriterion("issuePrice not between", value1, value2, "issueprice");
            return (Criteria) this;
        }

        public Criteria andProductlengthIsNull() {
            addCriterion("productLength is null");
            return (Criteria) this;
        }

        public Criteria andProductlengthIsNotNull() {
            addCriterion("productLength is not null");
            return (Criteria) this;
        }

        public Criteria andProductlengthEqualTo(String value) {
            addCriterion("productLength =", value, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductlengthNotEqualTo(String value) {
            addCriterion("productLength <>", value, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductlengthGreaterThan(String value) {
            addCriterion("productLength >", value, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductlengthGreaterThanOrEqualTo(String value) {
            addCriterion("productLength >=", value, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductlengthLessThan(String value) {
            addCriterion("productLength <", value, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductlengthLessThanOrEqualTo(String value) {
            addCriterion("productLength <=", value, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductlengthLike(String value) {
            addCriterion("productLength like", value, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductlengthNotLike(String value) {
            addCriterion("productLength not like", value, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductlengthIn(List<String> values) {
            addCriterion("productLength in", values, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductlengthNotIn(List<String> values) {
            addCriterion("productLength not in", values, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductlengthBetween(String value1, String value2) {
            addCriterion("productLength between", value1, value2, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductlengthNotBetween(String value1, String value2) {
            addCriterion("productLength not between", value1, value2, "productlength");
            return (Criteria) this;
        }

        public Criteria andProductshoulderwidthIsNull() {
            addCriterion("productShoulderWidth is null");
            return (Criteria) this;
        }

        public Criteria andProductshoulderwidthIsNotNull() {
            addCriterion("productShoulderWidth is not null");
            return (Criteria) this;
        }

        public Criteria andProductshoulderwidthEqualTo(String value) {
            addCriterion("productShoulderWidth =", value, "productshoulderwidth");
            return (Criteria) this;
        }

        public Criteria andProductshoulderwidthNotEqualTo(String value) {
            addCriterion("productShoulderWidth <>", value, "productshoulderwidth");
            return (Criteria) this;
        }

        public Criteria andProductshoulderwidthGreaterThan(String value) {
            addCriterion("productShoulderWidth >", value, "productshoulderwidth");
            return (Criteria) this;
        }

        public Criteria andProductshoulderwidthGreaterThanOrEqualTo(String value) {
            addCriterion("productShoulderWidth >=", value, "productshoulderwidth");
            return (Criteria) this;
        }

        public Criteria andProductshoulderwidthLessThan(String value) {
            addCriterion("productShoulderWidth <", value, "productshoulderwidth");
            return (Criteria) this;
        }

        public Criteria andProductshoulderwidthLessThanOrEqualTo(String value) {
            addCriterion("productShoulderWidth <=", value, "productshoulderwidth");
            return (Criteria) this;
        }

        public Criteria andProductshoulderwidthLike(String value) {
            addCriterion("productShoulderWidth like", value, "productshoulderwidth");
            return (Criteria) this;
        }

        public Criteria andProductshoulderwidthNotLike(String value) {
            addCriterion("productShoulderWidth not like", value, "productshoulderwidth");
            return (Criteria) this;
        }

        public Criteria andProductshoulderwidthIn(List<String> values) {
            addCriterion("productShoulderWidth in", values, "productshoulderwidth");
            return (Criteria) this;
        }

        public Criteria andProductshoulderwidthNotIn(List<String> values) {
            addCriterion("productShoulderWidth not in", values, "productshoulderwidth");
            return (Criteria) this;
        }

        public Criteria andProductshoulderwidthBetween(String value1, String value2) {
            addCriterion("productShoulderWidth between", value1, value2, "productshoulderwidth");
            return (Criteria) this;
        }

        public Criteria andProductshoulderwidthNotBetween(String value1, String value2) {
            addCriterion("productShoulderWidth not between", value1, value2, "productshoulderwidth");
            return (Criteria) this;
        }

        public Criteria andSleevelengthIsNull() {
            addCriterion("sleeveLength is null");
            return (Criteria) this;
        }

        public Criteria andSleevelengthIsNotNull() {
            addCriterion("sleeveLength is not null");
            return (Criteria) this;
        }

        public Criteria andSleevelengthEqualTo(String value) {
            addCriterion("sleeveLength =", value, "sleevelength");
            return (Criteria) this;
        }

        public Criteria andSleevelengthNotEqualTo(String value) {
            addCriterion("sleeveLength <>", value, "sleevelength");
            return (Criteria) this;
        }

        public Criteria andSleevelengthGreaterThan(String value) {
            addCriterion("sleeveLength >", value, "sleevelength");
            return (Criteria) this;
        }

        public Criteria andSleevelengthGreaterThanOrEqualTo(String value) {
            addCriterion("sleeveLength >=", value, "sleevelength");
            return (Criteria) this;
        }

        public Criteria andSleevelengthLessThan(String value) {
            addCriterion("sleeveLength <", value, "sleevelength");
            return (Criteria) this;
        }

        public Criteria andSleevelengthLessThanOrEqualTo(String value) {
            addCriterion("sleeveLength <=", value, "sleevelength");
            return (Criteria) this;
        }

        public Criteria andSleevelengthLike(String value) {
            addCriterion("sleeveLength like", value, "sleevelength");
            return (Criteria) this;
        }

        public Criteria andSleevelengthNotLike(String value) {
            addCriterion("sleeveLength not like", value, "sleevelength");
            return (Criteria) this;
        }

        public Criteria andSleevelengthIn(List<String> values) {
            addCriterion("sleeveLength in", values, "sleevelength");
            return (Criteria) this;
        }

        public Criteria andSleevelengthNotIn(List<String> values) {
            addCriterion("sleeveLength not in", values, "sleevelength");
            return (Criteria) this;
        }

        public Criteria andSleevelengthBetween(String value1, String value2) {
            addCriterion("sleeveLength between", value1, value2, "sleevelength");
            return (Criteria) this;
        }

        public Criteria andSleevelengthNotBetween(String value1, String value2) {
            addCriterion("sleeveLength not between", value1, value2, "sleevelength");
            return (Criteria) this;
        }

        public Criteria andProductnotesIsNull() {
            addCriterion("productnotes is null");
            return (Criteria) this;
        }

        public Criteria andProductnotesIsNotNull() {
            addCriterion("productnotes is not null");
            return (Criteria) this;
        }

        public Criteria andProductnotesEqualTo(String value) {
            addCriterion("productnotes =", value, "productnotes");
            return (Criteria) this;
        }

        public Criteria andProductnotesNotEqualTo(String value) {
            addCriterion("productnotes <>", value, "productnotes");
            return (Criteria) this;
        }

        public Criteria andProductnotesGreaterThan(String value) {
            addCriterion("productnotes >", value, "productnotes");
            return (Criteria) this;
        }

        public Criteria andProductnotesGreaterThanOrEqualTo(String value) {
            addCriterion("productnotes >=", value, "productnotes");
            return (Criteria) this;
        }

        public Criteria andProductnotesLessThan(String value) {
            addCriterion("productnotes <", value, "productnotes");
            return (Criteria) this;
        }

        public Criteria andProductnotesLessThanOrEqualTo(String value) {
            addCriterion("productnotes <=", value, "productnotes");
            return (Criteria) this;
        }

        public Criteria andProductnotesLike(String value) {
            addCriterion("productnotes like", value, "productnotes");
            return (Criteria) this;
        }

        public Criteria andProductnotesNotLike(String value) {
            addCriterion("productnotes not like", value, "productnotes");
            return (Criteria) this;
        }

        public Criteria andProductnotesIn(List<String> values) {
            addCriterion("productnotes in", values, "productnotes");
            return (Criteria) this;
        }

        public Criteria andProductnotesNotIn(List<String> values) {
            addCriterion("productnotes not in", values, "productnotes");
            return (Criteria) this;
        }

        public Criteria andProductnotesBetween(String value1, String value2) {
            addCriterion("productnotes between", value1, value2, "productnotes");
            return (Criteria) this;
        }

        public Criteria andProductnotesNotBetween(String value1, String value2) {
            addCriterion("productnotes not between", value1, value2, "productnotes");
            return (Criteria) this;
        }

        public Criteria andProductcategoryIsNull() {
            addCriterion("productcategory is null");
            return (Criteria) this;
        }

        public Criteria andProductcategoryIsNotNull() {
            addCriterion("productcategory is not null");
            return (Criteria) this;
        }

        public Criteria andProductcategoryEqualTo(String value) {
            addCriterion("productcategory =", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryNotEqualTo(String value) {
            addCriterion("productcategory <>", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryGreaterThan(String value) {
            addCriterion("productcategory >", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("productcategory >=", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryLessThan(String value) {
            addCriterion("productcategory <", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryLessThanOrEqualTo(String value) {
            addCriterion("productcategory <=", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryLike(String value) {
            addCriterion("productcategory like", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryNotLike(String value) {
            addCriterion("productcategory not like", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryIn(List<String> values) {
            addCriterion("productcategory in", values, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryNotIn(List<String> values) {
            addCriterion("productcategory not in", values, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryBetween(String value1, String value2) {
            addCriterion("productcategory between", value1, value2, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryNotBetween(String value1, String value2) {
            addCriterion("productcategory not between", value1, value2, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductlabelIsNull() {
            addCriterion("productlabel is null");
            return (Criteria) this;
        }

        public Criteria andProductlabelIsNotNull() {
            addCriterion("productlabel is not null");
            return (Criteria) this;
        }

        public Criteria andProductlabelEqualTo(String value) {
            addCriterion("productlabel =", value, "productlabel");
            return (Criteria) this;
        }

        public Criteria andProductlabelNotEqualTo(String value) {
            addCriterion("productlabel <>", value, "productlabel");
            return (Criteria) this;
        }

        public Criteria andProductlabelGreaterThan(String value) {
            addCriterion("productlabel >", value, "productlabel");
            return (Criteria) this;
        }

        public Criteria andProductlabelGreaterThanOrEqualTo(String value) {
            addCriterion("productlabel >=", value, "productlabel");
            return (Criteria) this;
        }

        public Criteria andProductlabelLessThan(String value) {
            addCriterion("productlabel <", value, "productlabel");
            return (Criteria) this;
        }

        public Criteria andProductlabelLessThanOrEqualTo(String value) {
            addCriterion("productlabel <=", value, "productlabel");
            return (Criteria) this;
        }

        public Criteria andProductlabelLike(String value) {
            addCriterion("productlabel like", value, "productlabel");
            return (Criteria) this;
        }

        public Criteria andProductlabelNotLike(String value) {
            addCriterion("productlabel not like", value, "productlabel");
            return (Criteria) this;
        }

        public Criteria andProductlabelIn(List<String> values) {
            addCriterion("productlabel in", values, "productlabel");
            return (Criteria) this;
        }

        public Criteria andProductlabelNotIn(List<String> values) {
            addCriterion("productlabel not in", values, "productlabel");
            return (Criteria) this;
        }

        public Criteria andProductlabelBetween(String value1, String value2) {
            addCriterion("productlabel between", value1, value2, "productlabel");
            return (Criteria) this;
        }

        public Criteria andProductlabelNotBetween(String value1, String value2) {
            addCriterion("productlabel not between", value1, value2, "productlabel");
            return (Criteria) this;
        }

        public Criteria andProductcolorIsNull() {
            addCriterion("productColor is null");
            return (Criteria) this;
        }

        public Criteria andProductcolorIsNotNull() {
            addCriterion("productColor is not null");
            return (Criteria) this;
        }

        public Criteria andProductcolorEqualTo(String value) {
            addCriterion("productColor =", value, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorNotEqualTo(String value) {
            addCriterion("productColor <>", value, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorGreaterThan(String value) {
            addCriterion("productColor >", value, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorGreaterThanOrEqualTo(String value) {
            addCriterion("productColor >=", value, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorLessThan(String value) {
            addCriterion("productColor <", value, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorLessThanOrEqualTo(String value) {
            addCriterion("productColor <=", value, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorLike(String value) {
            addCriterion("productColor like", value, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorNotLike(String value) {
            addCriterion("productColor not like", value, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorIn(List<String> values) {
            addCriterion("productColor in", values, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorNotIn(List<String> values) {
            addCriterion("productColor not in", values, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorBetween(String value1, String value2) {
            addCriterion("productColor between", value1, value2, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorNotBetween(String value1, String value2) {
            addCriterion("productColor not between", value1, value2, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductmaterialIsNull() {
            addCriterion("productMaterial is null");
            return (Criteria) this;
        }

        public Criteria andProductmaterialIsNotNull() {
            addCriterion("productMaterial is not null");
            return (Criteria) this;
        }

        public Criteria andProductmaterialEqualTo(String value) {
            addCriterion("productMaterial =", value, "productmaterial");
            return (Criteria) this;
        }

        public Criteria andProductmaterialNotEqualTo(String value) {
            addCriterion("productMaterial <>", value, "productmaterial");
            return (Criteria) this;
        }

        public Criteria andProductmaterialGreaterThan(String value) {
            addCriterion("productMaterial >", value, "productmaterial");
            return (Criteria) this;
        }

        public Criteria andProductmaterialGreaterThanOrEqualTo(String value) {
            addCriterion("productMaterial >=", value, "productmaterial");
            return (Criteria) this;
        }

        public Criteria andProductmaterialLessThan(String value) {
            addCriterion("productMaterial <", value, "productmaterial");
            return (Criteria) this;
        }

        public Criteria andProductmaterialLessThanOrEqualTo(String value) {
            addCriterion("productMaterial <=", value, "productmaterial");
            return (Criteria) this;
        }

        public Criteria andProductmaterialLike(String value) {
            addCriterion("productMaterial like", value, "productmaterial");
            return (Criteria) this;
        }

        public Criteria andProductmaterialNotLike(String value) {
            addCriterion("productMaterial not like", value, "productmaterial");
            return (Criteria) this;
        }

        public Criteria andProductmaterialIn(List<String> values) {
            addCriterion("productMaterial in", values, "productmaterial");
            return (Criteria) this;
        }

        public Criteria andProductmaterialNotIn(List<String> values) {
            addCriterion("productMaterial not in", values, "productmaterial");
            return (Criteria) this;
        }

        public Criteria andProductmaterialBetween(String value1, String value2) {
            addCriterion("productMaterial between", value1, value2, "productmaterial");
            return (Criteria) this;
        }

        public Criteria andProductmaterialNotBetween(String value1, String value2) {
            addCriterion("productMaterial not between", value1, value2, "productmaterial");
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