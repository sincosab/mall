package com.macro.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrawlSiteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrawlSiteExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSiteIsNull() {
            addCriterion("site is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("site is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(String value) {
            addCriterion("site =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(String value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(String value) {
            addCriterion("site >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(String value) {
            addCriterion("site >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(String value) {
            addCriterion("site <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(String value) {
            addCriterion("site <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLike(String value) {
            addCriterion("site like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotLike(String value) {
            addCriterion("site not like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<String> values) {
            addCriterion("site in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<String> values) {
            addCriterion("site not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(String value1, String value2) {
            addCriterion("site between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(String value1, String value2) {
            addCriterion("site not between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andInitUrlIsNull() {
            addCriterion("init_url is null");
            return (Criteria) this;
        }

        public Criteria andInitUrlIsNotNull() {
            addCriterion("init_url is not null");
            return (Criteria) this;
        }

        public Criteria andInitUrlEqualTo(String value) {
            addCriterion("init_url =", value, "initUrl");
            return (Criteria) this;
        }

        public Criteria andInitUrlNotEqualTo(String value) {
            addCriterion("init_url <>", value, "initUrl");
            return (Criteria) this;
        }

        public Criteria andInitUrlGreaterThan(String value) {
            addCriterion("init_url >", value, "initUrl");
            return (Criteria) this;
        }

        public Criteria andInitUrlGreaterThanOrEqualTo(String value) {
            addCriterion("init_url >=", value, "initUrl");
            return (Criteria) this;
        }

        public Criteria andInitUrlLessThan(String value) {
            addCriterion("init_url <", value, "initUrl");
            return (Criteria) this;
        }

        public Criteria andInitUrlLessThanOrEqualTo(String value) {
            addCriterion("init_url <=", value, "initUrl");
            return (Criteria) this;
        }

        public Criteria andInitUrlLike(String value) {
            addCriterion("init_url like", value, "initUrl");
            return (Criteria) this;
        }

        public Criteria andInitUrlNotLike(String value) {
            addCriterion("init_url not like", value, "initUrl");
            return (Criteria) this;
        }

        public Criteria andInitUrlIn(List<String> values) {
            addCriterion("init_url in", values, "initUrl");
            return (Criteria) this;
        }

        public Criteria andInitUrlNotIn(List<String> values) {
            addCriterion("init_url not in", values, "initUrl");
            return (Criteria) this;
        }

        public Criteria andInitUrlBetween(String value1, String value2) {
            addCriterion("init_url between", value1, value2, "initUrl");
            return (Criteria) this;
        }

        public Criteria andInitUrlNotBetween(String value1, String value2) {
            addCriterion("init_url not between", value1, value2, "initUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlIsNull() {
            addCriterion("page_url is null");
            return (Criteria) this;
        }

        public Criteria andPageUrlIsNotNull() {
            addCriterion("page_url is not null");
            return (Criteria) this;
        }

        public Criteria andPageUrlEqualTo(String value) {
            addCriterion("page_url =", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlNotEqualTo(String value) {
            addCriterion("page_url <>", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlGreaterThan(String value) {
            addCriterion("page_url >", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("page_url >=", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlLessThan(String value) {
            addCriterion("page_url <", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlLessThanOrEqualTo(String value) {
            addCriterion("page_url <=", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlLike(String value) {
            addCriterion("page_url like", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlNotLike(String value) {
            addCriterion("page_url not like", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlIn(List<String> values) {
            addCriterion("page_url in", values, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlNotIn(List<String> values) {
            addCriterion("page_url not in", values, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlBetween(String value1, String value2) {
            addCriterion("page_url between", value1, value2, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlNotBetween(String value1, String value2) {
            addCriterion("page_url not between", value1, value2, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageStartIsNull() {
            addCriterion("page_start is null");
            return (Criteria) this;
        }

        public Criteria andPageStartIsNotNull() {
            addCriterion("page_start is not null");
            return (Criteria) this;
        }

        public Criteria andPageStartEqualTo(Integer value) {
            addCriterion("page_start =", value, "pageStart");
            return (Criteria) this;
        }

        public Criteria andPageStartNotEqualTo(Integer value) {
            addCriterion("page_start <>", value, "pageStart");
            return (Criteria) this;
        }

        public Criteria andPageStartGreaterThan(Integer value) {
            addCriterion("page_start >", value, "pageStart");
            return (Criteria) this;
        }

        public Criteria andPageStartGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_start >=", value, "pageStart");
            return (Criteria) this;
        }

        public Criteria andPageStartLessThan(Integer value) {
            addCriterion("page_start <", value, "pageStart");
            return (Criteria) this;
        }

        public Criteria andPageStartLessThanOrEqualTo(Integer value) {
            addCriterion("page_start <=", value, "pageStart");
            return (Criteria) this;
        }

        public Criteria andPageStartIn(List<Integer> values) {
            addCriterion("page_start in", values, "pageStart");
            return (Criteria) this;
        }

        public Criteria andPageStartNotIn(List<Integer> values) {
            addCriterion("page_start not in", values, "pageStart");
            return (Criteria) this;
        }

        public Criteria andPageStartBetween(Integer value1, Integer value2) {
            addCriterion("page_start between", value1, value2, "pageStart");
            return (Criteria) this;
        }

        public Criteria andPageStartNotBetween(Integer value1, Integer value2) {
            addCriterion("page_start not between", value1, value2, "pageStart");
            return (Criteria) this;
        }

        public Criteria andPageEndIsNull() {
            addCriterion("page_end is null");
            return (Criteria) this;
        }

        public Criteria andPageEndIsNotNull() {
            addCriterion("page_end is not null");
            return (Criteria) this;
        }

        public Criteria andPageEndEqualTo(Integer value) {
            addCriterion("page_end =", value, "pageEnd");
            return (Criteria) this;
        }

        public Criteria andPageEndNotEqualTo(Integer value) {
            addCriterion("page_end <>", value, "pageEnd");
            return (Criteria) this;
        }

        public Criteria andPageEndGreaterThan(Integer value) {
            addCriterion("page_end >", value, "pageEnd");
            return (Criteria) this;
        }

        public Criteria andPageEndGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_end >=", value, "pageEnd");
            return (Criteria) this;
        }

        public Criteria andPageEndLessThan(Integer value) {
            addCriterion("page_end <", value, "pageEnd");
            return (Criteria) this;
        }

        public Criteria andPageEndLessThanOrEqualTo(Integer value) {
            addCriterion("page_end <=", value, "pageEnd");
            return (Criteria) this;
        }

        public Criteria andPageEndIn(List<Integer> values) {
            addCriterion("page_end in", values, "pageEnd");
            return (Criteria) this;
        }

        public Criteria andPageEndNotIn(List<Integer> values) {
            addCriterion("page_end not in", values, "pageEnd");
            return (Criteria) this;
        }

        public Criteria andPageEndBetween(Integer value1, Integer value2) {
            addCriterion("page_end between", value1, value2, "pageEnd");
            return (Criteria) this;
        }

        public Criteria andPageEndNotBetween(Integer value1, Integer value2) {
            addCriterion("page_end not between", value1, value2, "pageEnd");
            return (Criteria) this;
        }

        public Criteria andRegexIsNull() {
            addCriterion("regex is null");
            return (Criteria) this;
        }

        public Criteria andRegexIsNotNull() {
            addCriterion("regex is not null");
            return (Criteria) this;
        }

        public Criteria andRegexEqualTo(String value) {
            addCriterion("regex =", value, "regex");
            return (Criteria) this;
        }

        public Criteria andRegexNotEqualTo(String value) {
            addCriterion("regex <>", value, "regex");
            return (Criteria) this;
        }

        public Criteria andRegexGreaterThan(String value) {
            addCriterion("regex >", value, "regex");
            return (Criteria) this;
        }

        public Criteria andRegexGreaterThanOrEqualTo(String value) {
            addCriterion("regex >=", value, "regex");
            return (Criteria) this;
        }

        public Criteria andRegexLessThan(String value) {
            addCriterion("regex <", value, "regex");
            return (Criteria) this;
        }

        public Criteria andRegexLessThanOrEqualTo(String value) {
            addCriterion("regex <=", value, "regex");
            return (Criteria) this;
        }

        public Criteria andRegexLike(String value) {
            addCriterion("regex like", value, "regex");
            return (Criteria) this;
        }

        public Criteria andRegexNotLike(String value) {
            addCriterion("regex not like", value, "regex");
            return (Criteria) this;
        }

        public Criteria andRegexIn(List<String> values) {
            addCriterion("regex in", values, "regex");
            return (Criteria) this;
        }

        public Criteria andRegexNotIn(List<String> values) {
            addCriterion("regex not in", values, "regex");
            return (Criteria) this;
        }

        public Criteria andRegexBetween(String value1, String value2) {
            addCriterion("regex between", value1, value2, "regex");
            return (Criteria) this;
        }

        public Criteria andRegexNotBetween(String value1, String value2) {
            addCriterion("regex not between", value1, value2, "regex");
            return (Criteria) this;
        }

        public Criteria andMatchUrlIsNull() {
            addCriterion("match_url is null");
            return (Criteria) this;
        }

        public Criteria andMatchUrlIsNotNull() {
            addCriterion("match_url is not null");
            return (Criteria) this;
        }

        public Criteria andMatchUrlEqualTo(String value) {
            addCriterion("match_url =", value, "matchUrl");
            return (Criteria) this;
        }

        public Criteria andMatchUrlNotEqualTo(String value) {
            addCriterion("match_url <>", value, "matchUrl");
            return (Criteria) this;
        }

        public Criteria andMatchUrlGreaterThan(String value) {
            addCriterion("match_url >", value, "matchUrl");
            return (Criteria) this;
        }

        public Criteria andMatchUrlGreaterThanOrEqualTo(String value) {
            addCriterion("match_url >=", value, "matchUrl");
            return (Criteria) this;
        }

        public Criteria andMatchUrlLessThan(String value) {
            addCriterion("match_url <", value, "matchUrl");
            return (Criteria) this;
        }

        public Criteria andMatchUrlLessThanOrEqualTo(String value) {
            addCriterion("match_url <=", value, "matchUrl");
            return (Criteria) this;
        }

        public Criteria andMatchUrlLike(String value) {
            addCriterion("match_url like", value, "matchUrl");
            return (Criteria) this;
        }

        public Criteria andMatchUrlNotLike(String value) {
            addCriterion("match_url not like", value, "matchUrl");
            return (Criteria) this;
        }

        public Criteria andMatchUrlIn(List<String> values) {
            addCriterion("match_url in", values, "matchUrl");
            return (Criteria) this;
        }

        public Criteria andMatchUrlNotIn(List<String> values) {
            addCriterion("match_url not in", values, "matchUrl");
            return (Criteria) this;
        }

        public Criteria andMatchUrlBetween(String value1, String value2) {
            addCriterion("match_url between", value1, value2, "matchUrl");
            return (Criteria) this;
        }

        public Criteria andMatchUrlNotBetween(String value1, String value2) {
            addCriterion("match_url not between", value1, value2, "matchUrl");
            return (Criteria) this;
        }

        public Criteria andMetaFlagIsNull() {
            addCriterion("meta_flag is null");
            return (Criteria) this;
        }

        public Criteria andMetaFlagIsNotNull() {
            addCriterion("meta_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMetaFlagEqualTo(String value) {
            addCriterion("meta_flag =", value, "metaFlag");
            return (Criteria) this;
        }

        public Criteria andMetaFlagNotEqualTo(String value) {
            addCriterion("meta_flag <>", value, "metaFlag");
            return (Criteria) this;
        }

        public Criteria andMetaFlagGreaterThan(String value) {
            addCriterion("meta_flag >", value, "metaFlag");
            return (Criteria) this;
        }

        public Criteria andMetaFlagGreaterThanOrEqualTo(String value) {
            addCriterion("meta_flag >=", value, "metaFlag");
            return (Criteria) this;
        }

        public Criteria andMetaFlagLessThan(String value) {
            addCriterion("meta_flag <", value, "metaFlag");
            return (Criteria) this;
        }

        public Criteria andMetaFlagLessThanOrEqualTo(String value) {
            addCriterion("meta_flag <=", value, "metaFlag");
            return (Criteria) this;
        }

        public Criteria andMetaFlagLike(String value) {
            addCriterion("meta_flag like", value, "metaFlag");
            return (Criteria) this;
        }

        public Criteria andMetaFlagNotLike(String value) {
            addCriterion("meta_flag not like", value, "metaFlag");
            return (Criteria) this;
        }

        public Criteria andMetaFlagIn(List<String> values) {
            addCriterion("meta_flag in", values, "metaFlag");
            return (Criteria) this;
        }

        public Criteria andMetaFlagNotIn(List<String> values) {
            addCriterion("meta_flag not in", values, "metaFlag");
            return (Criteria) this;
        }

        public Criteria andMetaFlagBetween(String value1, String value2) {
            addCriterion("meta_flag between", value1, value2, "metaFlag");
            return (Criteria) this;
        }

        public Criteria andMetaFlagNotBetween(String value1, String value2) {
            addCriterion("meta_flag not between", value1, value2, "metaFlag");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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