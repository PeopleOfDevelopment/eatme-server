package com.example.eatmeserver.user.qna;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QnaMapper {
    /** Q&A 리스트 조회 */
    List<QnaFlex> selectQna(QnaParam param);

    /** Q&A 상세보기 */
    QnaFlex selectQnaDetail(QnaParam param);

    /** Q&A 등록 */
    int insertQna(QnaFlex flex);

    /** Q&A 삭제 */
    int deleteQna(QnaFlex flex);

    /** Q&A 수정 */
    int updateQna(QnaFlex flex);
}
