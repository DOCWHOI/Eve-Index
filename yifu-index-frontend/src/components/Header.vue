<template>
  <a-layout-header class="header" style="position:fixed; width:100%; z-index:50; background:rgba(255,255,255,0.95); box-shadow:0 2px 8px #f0f1f2;">
    <div class="container" style="max-width:1200px; margin:0 auto; display:flex; justify-content:space-between; align-items:center; height:64px; padding:0 24px;">
      <!-- Logo 区域 -->
      <router-link to="/" class="flex items-center space-x-2" style="display:flex;align-items:center;text-decoration:none;">
        <div style="width:40px;height:40px;border-radius:8px;background:#165DFF;display:flex;align-items:center;justify-content:center;">
          <span class="anticon" style="color:#fff;font-size:24px;"><i class="fa fa-newspaper-o"></i></span>
        </div>
        <span style="font-size:20px;font-weight:bold;color:#222;">TechNews<span style="color:#165DFF;">Hub</span></span>
      </router-link>

      <!-- 主导航（桌面端） -->
      <nav class="hidden md:flex space-x-8" style="display:flex;gap:32px;">
        <router-link to="/" class="text-primary font-medium border-b-2 border-primary py-1" style="color:#165DFF;font-weight:500;border-bottom:2px solid #165DFF;padding:4px 0;">首页</router-link>
        <router-link to="/products" class="text-neutral-500 hover:text-primary font-medium transition-colors py-1" style="color:#909399;font-weight:500;padding:4px 0;">产品</router-link>
        <router-link to="/analysis" class="text-neutral-500 hover:text-primary font-medium transition-colors py-1" style="color:#909399;font-weight:500;padding:4px 0;">分析</router-link>
        <router-link to="/about" class="text-neutral-500 hover:text-primary font-medium transition-colors py-1" style="color:#909399;font-weight:500;padding:4px 0;">关于</router-link>
      </nav>

      <!-- 搜索框、通知、用户菜单 -->
      <div class="flex items-center space-x-4" style="display:flex;align-items:center;gap:16px;">
        <!-- 搜索框（桌面端） -->
        <a-input-search
          v-if="!isMobile"
          placeholder="搜索新闻、产品..."
          style="width:256px;"
          :allowClear="true"
        >
          <template #prefix>
            <i class="fa fa-search" style="color:#bfbfbf;"></i>
          </template>
        </a-input-search>

        <!-- 通知按钮 -->
        <a-badge dot>
          <a-button type="text" shape="circle" style="color:#909399;">
            <template #icon>
              <i class="fa fa-bell-o"></i>
            </template>
          </a-button>
        </a-badge>

        <!-- 用户头像及下拉菜单 -->
        <a-dropdown placement="bottomRight">
          <a class="ant-dropdown-link" @click.prevent style="display:flex;align-items:center;gap:8px;cursor:pointer;">
            <a-avatar :src="userAvatar" size="large" />
            <span class="hidden md:inline-block text-sm font-medium" style="font-size:14px;">游客</span>
            <i class="fa fa-angle-down" style="color:#bfbfbf;"></i>
          </a>
          <template #overlay>
            <a-menu>
              <a-menu-item key="profile">
                <i class="fa fa-user-o" style="margin-right:8px;"></i>个人中心
              </a-menu-item>
              <a-menu-item key="fav">
                <i class="fa fa-bookmark-o" style="margin-right:8px;"></i>我的收藏
              </a-menu-item>
              <a-menu-item key="setting">
                <i class="fa fa-cog" style="margin-right:8px;"></i>设置
              </a-menu-item>
              <a-menu-divider />
              <a-menu-item key="logout">
                <i class="fa fa-sign-out" style="margin-right:8px;color:#f5222d;"></i>
                <span style="color:#f5222d;">退出登录</span>
              </a-menu-item>
            </a-menu>
          </template>
        </a-dropdown>

        <!-- 移动端菜单按钮 -->
        <a-button class="md:hidden" type="text" shape="circle" @click="toggleMobileMenu" style="display:none;">
          <template #icon>
            <i class="fa fa-bars" style="font-size:20px;"></i>
          </template>
        </a-button>
      </div>
    </div>
    <!-- 移动端导航菜单 -->
    <transition name="fade">
      <div v-if="mobileMenuVisible" class="md:hidden" style="background:#fff;border-top:1px solid #eee;">
        <div class="container" style="max-width:1200px;margin:0 auto;padding:12px 24px;">
          <router-link to="/" class="block py-2 text-primary font-medium" style="color:#165DFF;font-weight:500;">首页</router-link>
          <router-link to="/products" class="block py-2 text-neutral-500 hover:text-primary" style="color:#909399;">产品</router-link>
          <router-link to="/analysis" class="block py-2 text-neutral-500 hover:text-primary" style="color:#909399;">分析</router-link>
          <router-link to="/about" class="block py-2 text-neutral-500 hover:text-primary" style="color:#909399;">关于</router-link>
          <a-input-search
            placeholder="搜索新闻、产品..."
            style="width:100%;margin-top:16px;"
            :allowClear="true"
          >
            <template #prefix>
              <i class="fa fa-search" style="color:#bfbfbf;"></i>
            </template>
          </a-input-search>
        </div>
      </div>
    </transition>
  </a-layout-header>
</template>

<script setup lang="ts">
import { ref, computed, onMounted } from 'vue'
const userAvatar = 'https://picsum.photos/seed/user123/200'
const mobileMenuVisible = ref(false)
const isMobile = ref(false)

const checkMobile = () => {
  isMobile.value = window.innerWidth < 768
}
const toggleMobileMenu = () => {
  mobileMenuVisible.value = !mobileMenuVisible.value
}

onMounted(() => {
  checkMobile()
  window.addEventListener('resize', checkMobile)
})
</script>

<style scoped>
.header {
  padding: 0;
  background: rgba(255,255,255,0.95);
  box-shadow: 0 2px 8px #f0f1f2;
}
@media (max-width: 767px) {
  .md\:hidden {
    display: block !important;
  }
  .md\:flex {
    display: none !important;
  }
}
</style>
