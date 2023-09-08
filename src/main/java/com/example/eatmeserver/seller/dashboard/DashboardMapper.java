package com.example.eatmeserver.seller.dashboard;

import com.example.eatmeserver.seller.dashboard.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DashboardMapper {

    /** 매출 조회 */
    List<DashboardSellingFlex> getSelling(DashboardParam param);

    /** 문의 조회 */
    List<DashboardQnaFlex> selectQna(DashboardParam param);

    /** 문의 상세 조회 */
    DashboardQnaDetailFlex selectQnaDetail(DashboardQnaParam param);

    /** 픽업 & 배송조회 */
    DashboardPickDelFlex selectSellingPickDel(DashboardParam param);

    /** 할인품목 추천*/
    //TO-DO : ai를 활용 해보고 안되면 추가 예정

}
