package com.winter.dao;

import com.winter.domain.Meeting;
import com.winter.vo.MeetingVo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface MeetingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Meeting record);

    int insertSelective(Meeting record);

    Meeting selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Meeting record);

    int updateByPrimaryKey(Meeting record);

    List<Meeting> getMeetingByRoomId(@Param("roomId") Integer roomId, @Param("flag") Integer flag);

    List<Meeting> getMeetingsOngoing(Integer userId);

    List<Meeting> getMeetingsFinished(Integer userId);

    int whetherBook(@Param("roomId") Integer roomId, @Param("startTime") Date startTime, @Param("endTime") Date endTime);

    Integer bookMeeting(Meeting meeting);

    Integer getMeetingMasterId(Integer meetingId);

    int setMeetingStatus(@Param("meetingId") Integer meetingId, @Param("status") Integer status);

}