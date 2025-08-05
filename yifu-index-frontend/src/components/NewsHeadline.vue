<template>
  <div style="display: grid; grid-template-columns: 2fr 1fr; gap: 24px; margin-bottom: 40px;">
    <!-- 大头条新闻 -->
    <div style="position: relative; border-radius: 16px; overflow: hidden; height: 400px;">
      <img src="https://picsum.photos/seed/tech1/800/400" alt="人工智能最新进展" style="width: 100%; height: 100%; object-fit: cover;">
      <div style="position: absolute; inset: 0; background: linear-gradient(to bottom, rgba(0,0,0,0) 0%, rgba(0,0,0,0.7) 100%);"></div>
      <div style="position: absolute; bottom: 0; left: 0; right: 0; padding: 24px;">
        <div style="display: flex; align-items: center; gap: 12px; margin-bottom: 12px;">
          <span style="display: inline-block; padding: 4px 12px; background: #FF7D00; color: #fff; font-size: 12px; font-weight: 500; border-radius: 999px;">技术突破</span>
          <span style="display: inline-block; padding: 4px 12px; background: #1677ff; color: #fff; font-size: 12px; font-weight: 500; border-radius: 999px;">人工智能</span>
          <span style="display: inline-block; padding: 4px 12px; background: #52c41a; color: #fff; font-size: 12px; font-weight: 500; border-radius: 999px;">美国</span>
        </div>
        <h3 style="font-size: 24px; font-weight: bold; color: #fff; margin-bottom: 8px;">人工智能技术取得重大突破，新型语言模型展现惊人能力</h3>
        <p style="color: rgba(255,255,255,0.9); margin-bottom: 16px; font-size: 16px;">最新一代人工智能语言模型在多项基准测试中超越人类表现，引发业界对AI发展前景的广泛讨论。</p>
        <div style="display: flex; align-items: center;">
          <img src="https://picsum.photos/seed/author1/100" alt="作者头像" style="width: 32px; height: 32px; border-radius: 50%; object-fit: cover; margin-right: 8px;">
          <span style="color: rgba(255,255,255,0.8); font-size: 14px;">科技前沿观察员</span>
          <span style="margin: 0 8px; color: rgba(255,255,255,0.6);">•</span>
          <span style="color: rgba(255,255,255,0.8); font-size: 14px;">2小时前</span>
        </div>
      </div>
    </div>
    <!-- 右侧小新闻卡片（可复制添加更多） -->
    <div style="display: flex; flex-direction: column; gap: 24px;">
      <div style="background: #F5F7FA; border-radius: 16px; box-shadow: 0 4px 20px rgba(0,0,0,0.08); padding: 16px; display: flex; flex-direction: column; height: 100%;">
        <img src="https://picsum.photos/seed/tech2/400/200" alt="新闻图片" style="width: 100%; height: 96px; object-fit: cover; border-radius: 8px; margin-bottom: 12px;">
        <div style="display: flex; align-items: center; gap: 8px; margin-bottom: 8px;">
          <span style="display: inline-block; padding: 2px 8px; background: #1677ff; color: #fff; font-size: 12px; border-radius: 999px;">智能手机</span>
          <span style="color: #C0C4CC; font-size: 12px;">中国</span>
        </div>
        <h4 style="font-size: 18px; font-weight: bold; color: #303133; margin-bottom: 4px;">国产旗舰手机发布，影像系统再升级</h4>
        <p style="color: #909399; font-size: 14px; margin-bottom: 8px;">新一代国产旗舰手机正式发布，搭载自研影像芯片，拍照体验大幅提升。</p>
        <div style="display: flex; align-items: center; margin-top: auto;">
          <img src="https://picsum.photos/seed/author2/100" alt="作者头像" style="width: 24px; height: 24px; border-radius: 50%; object-fit: cover; margin-right: 8px;">
          <span style="color: #909399; font-size: 12px;">数码达人</span>
          <span style="margin: 0 4px; color: #C0C4CC;">•</span>
          <span style="color: #C0C4CC; font-size: 12px;">1小时前</span>
        </div>
      </div>
    </div>
  </div>
</template>
