package com.eveindex.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("competitor")
public class Competitor {
    
    @TableId(type = IdType.AUTO)
    private Long compId;
    
    private String name;
    
    private String productType;
    
    private String description;
    
    private LocalDateTime createTime;
    
    private LocalDateTime updateTime;
} 