package com.example.eatmeserver.seller.dashboard;

import com.example.eatmeserver.seller.dashboard.model.DashboardParam;
import com.example.eatmeserver.seller.dashboard.model.DashboardQnaDetailFlex;
import com.example.eatmeserver.seller.dashboard.model.DashboardQnaFlex;
import com.example.eatmeserver.seller.dashboard.model.DashboardQnaParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DashboardMapper {

    /** 매출 조회 */
    Integer getSelling(DashboardParam param);

    /** 문의 조회 */
    List<DashboardQnaFlex> selectQna(DashboardParam param);

    /** 문의 상세 조회 */
    DashboardQnaDetailFlex selectQnaDetail(DashboardQnaParam param);

    /** 픽업 조회 */
    

    /** 배송 조회*/


    /** 할인품목 추천*/
}
