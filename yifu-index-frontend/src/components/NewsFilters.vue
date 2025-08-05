<template>
  <div style="display: flex; flex-direction: column; gap: 24px; margin-bottom: 32px;">
    <div style="display: flex; flex-direction: row; justify-content: space-between; align-items: center;">
      <div>
        <h2 style="font-size: 28px; font-weight: bold; color: #303133; margin-bottom: 8px;">最新资讯</h2>
        <p style="color: #909399;">发现全球科技领域的最新动态和深度报道</p>
      </div>
      <div style="display: flex; gap: 8px;">
        <a-select v-model:value="country" :options="countryOptions" style="width: 120px;" />
        <a-select v-model:value="sort" :options="sortOptions" style="width: 120px;" />
        <a-select v-model:value="product" :options="productOptions" style="width: 120px;" />
      </div>
    </div>
    <div style="display: flex; flex-direction: row; justify-content: space-between; align-items: center;">
      <div style="display: flex; gap: 24px; align-items: center;">
        <span style="color: #606266; font-size: 14px;">
          <span style="display: inline-block; width: 8px; height: 8px; background: #52c41a; border-radius: 50%; margin-right: 8px;"></span>
          上次更新：今天 06:30
        </span>
        <span style="color: #606266; font-size: 14px;">
          已更新数据：<span style="color: #165DFF; font-weight: 500;">12</span> 份
        </span>
      </div>
      <a-button type="primary">
        <i class="fa fa-refresh" style="margin-right: 8px;"></i>手动更新
      </a-button>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'
const country = ref('all')
const sort = ref('latest')
const product = ref('all')
const countryOptions = [
  { value: 'all', label: '所有国家' },
  { value: 'us', label: '美国' },
  { value: 'china', label: '中国' },
  { value: 'japan', label: '日本' },
  { value: 'germany', label: '德国' },
  { value: 'uk', label: '英国' }
]
const sortOptions = [
  { value: 'latest', label: '最新发布' },
  { value: 'views', label: '阅读量' }
]
const productOptions = [
  { value: 'all', label: '所有产品' },
  { value: 'phone', label: '智能手机' },
  { value: 'laptop', label: '笔记本电脑' },
  { value: 'tablet', label: '平板电脑' },
  { value: 'wearable', label: '可穿戴设备' },
  { value: 'ai', label: '人工智能' }
]
</script>
