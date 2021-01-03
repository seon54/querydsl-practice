package study.querydsl.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import study.querydsl.dto.MemberSearchCondition;
import study.querydsl.dto.MemberTeamDto;

import java.util.List;

public interface MemberCustomRepository {

    List<MemberTeamDto> search(MemberSearchCondition condition);
    Page<MemberTeamDto> searchSimplePage(MemberSearchCondition condition, Pageable pageable);
    Page<MemberTeamDto> searchComplexPage(MemberSearchCondition condition, Pageable pageable);
}
