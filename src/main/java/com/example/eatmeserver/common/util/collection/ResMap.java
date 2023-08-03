package com.example.eatmeserver.common.util.collection;

import java.util.HashMap;

@SuppressWarnings({ "rawtypes", "serial" })
public class ResMap extends HashMap {

    public ResMap() {
    }

    /**
     * 빌더 패턴의 맵을 생성한다. "data"를 key로 하는 HashMap을 생성한다. Controller에서 json으로 결과를 응답할때
     * 사용한다.
     *
     * 1. 서비스의 조회결과를 응답 return new ResMap(service.query(param));
     *
     * 2. 서비스의 조회결과에 추가해서 응답 return new ResMap(service.query(param)) .put("detail",
     * service.detail(param));
     *
     * @param value
     */
    public ResMap(Object value) {
        super();
        data(value);
    }

    /**
     * 빌더 패턴의 맵을 생성한다. "data"를 key로 하는 HashMap을 생성한다. Controller에서 json으로 결과를 응답할때
     * 사용한다.
     *
     * 1. 서비스의 조회결과를 응답 return new ResMap(service.query(param));
     *
     * 2. 서비스의 조회결과에 추가해서 응답 return new ResMap(service.query(param)) .put("detail",
     * service.detail(param));
     *
     * @param value
     */
    public ResMap(String key, Object value) {
        super();
        put(key, value);
    }

    /**
     * builder 패턴으로 map에 "data"를 key로 해서 value를 추가하고 map을 return 한다.
     *
     * @param value
     * @return this
     */
    public ResMap data(Object value) {
        // put("result", "ok");
        put("data", value);
        return this;
    }

    /**
     * builder 패턴으로 map에 key와 value를 추가하고 map을 return 한다. 원래 map의 put은 oldValue를
     * return 하는것과 다름.
     *
     * @param value
     * @return this
     */
    @SuppressWarnings("unchecked")
    public ResMap put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}