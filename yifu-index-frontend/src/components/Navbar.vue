<template>
  <header style="position: fixed; width: 100%; background: rgba(255,255,255,0.95); box-shadow: 0 1px 6px rgba(0,0,0,0.06); z-index: 100;">
    <div style="max-width: 1200px; margin: 0 auto; padding: 0 24px;">
      <div style="display: flex; justify-content: space-between; align-items: center; height: 64px;">
        <!-- Logo -->
        <a href="#" style="display: flex; align-items: center; gap: 8px; text-decoration: none;">
          <div style="width: 40px; height: 40px; border-radius: 8px; background: #165DFF; display: flex; align-items: center; justify-content: center;">
            <i class="fa fa-newspaper-o" style="color: #fff; font-size: 20px;"></i>
          </div>
          <span style="font-size: 20px; font-weight: bold; color: #303133;">Yifu<span style="color: #165DFF;">Index</span></span>
        </a>
        <!-- 主导航 -->
        <nav style="display: flex; gap: 32px;">
          <a href="#" style="color: #165DFF; font-weight: 500; border-bottom: 2px solid #165DFF; padding: 4px 0; text-decoration: none;">首页</a>
          <a href="#products" style="color: #909399; font-weight: 500; padding: 4px 0; text-decoration: none;">产品</a>
          <a href="#analysis" style="color: #909399; font-weight: 500; padding: 4px 0; text-decoration: none;">分析</a>
          <a href="#about" style="color: #909399; font-weight: 500; padding: 4px 0; text-decoration: none;">关于</a>
        </nav>
        <!-- 搜索、通知、用户菜单 -->
        <div style="display: flex; align-items: center; gap: 16px;">
          <!-- 搜索框 -->
          <a-input
            placeholder="搜索新闻、产品..."
            style="width: 256px; border-radius: 999px; border: 1px solid #E4E7ED; padding-left: 36px; background: #F5F7FA;"
            :bordered="false"
          >
            <template #prefix>
              <i class="fa fa-search" style="color: #909399;"></i>
            </template>
          </a-input>
          <!-- 通知按钮 -->
          <a-badge dot>
            <a-button shape="circle" style="background: none; border: none;">
              <i class="fa fa-bell-o" style="color: #909399;"></i>
            </a-button>
          </a-badge>
          <!-- 用户头像及下拉菜单 -->
          <a-dropdown>
            <a-button style="display: flex; align-items: center; gap: 8px; background: none; border: none;">
              <img src="https://picsum.photos/seed/user123/200" alt="用户头像" style="width: 32px; height: 32px; border-radius: 50%; object-fit: cover; border: 2px solid #fff; box-shadow: 0 1px 4px rgba(0,0,0,0.06);">
              <span style="font-size: 14px; font-weight: 500;">游客</span>
              <i class="fa fa-angle-down" style="color: #909399;"></i>
            </a-button>
            <template #overlay>
              <a-menu>
                <a-menu-item><i class="fa fa-user-o" style="margin-right: 8px;"></i>个人中心</a-menu-item>
                <a-menu-item><i class="fa fa-bookmark-o" style="margin-right: 8px;"></i>我的收藏</a-menu-item>
                <a-menu-item><i class="fa fa-cog" style="margin-right: 8px;"></i>设置</a-menu-item>
                <a-menu-divider />
                <a-menu-item danger><i class="fa fa-sign-out" style="margin-right: 8px;"></i>退出登录</a-menu-item>
              </a-menu>
            </template>
          </a-dropdown>
        </div>
      </div>
    </div>
  </header>
</template>
