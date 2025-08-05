<template>
  <footer class="bg-neutral-700 text-white pt-16 pb-8">
    <div class="container mx-auto px-4 sm:px-6 lg:px-8">
      <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-8 mb-12">
        <div>
          <div class="flex items-center space-x-2 mb-6">
            <div class="w-10 h-10 rounded-lg bg-primary flex items-center justify-center">
              <FileTextOutlined class="text-white text-xl" />
            </div>
            <span class="text-xl font-bold">TechNews<span class="text-primary">Hub</span></span>
          </div>
          <p class="text-neutral-300 mb-6">
            全球领先的科技新闻资讯平台，为您提供最新、最全面的科技产品和行业动态。
          </p>
          <div class="flex space-x-4">
            <a href="#" class="w-10 h-10 rounded-full bg-neutral-600 flex items-center justify-center hover:bg-primary transition-colors">
              <TwitterOutlined />
            </a>
            <a href="#" class="w-10 h-10 rounded-full bg-neutral-600 flex items-center justify-center hover:bg-primary transition-colors">
              <FacebookOutlined />
            </a>
            <a href="#" class="w-10 h-10 rounded-full bg-neutral-600 flex items-center justify-center hover:bg-primary transition-colors">
              <InstagramOutlined />
            </a>
            <a href="#" class="w-10 h-10 rounded-full bg-neutral-600 flex items-center justify-center hover:bg-primary transition-colors">
              <LinkedinOutlined />
            </a>
          </div>
        </div>
        
        <div>
          <h3 class="text-lg font-semibold mb-4">快速链接</h3>
          <ul class="space-y-2">
            <li><a href="#" class="text-neutral-300 hover:text-white transition-colors">首页</a></li>
            <li><a href="#" class="text-neutral-300 hover:text-white transition-colors">最新资讯</a></li>
            <li><a href="#" class="text-neutral-300 hover:text-white transition-colors">热门产品</a></li>
            <li><a href="#" class="text-neutral-300 hover:text-white transition-colors">数据分析</a></li>
            <li><a href="#" class="text-neutral-300 hover:text-white transition-colors">关于我们</a></li>
          </ul>
        </div>
        
        <div>
          <h3 class="text-lg font-semibold mb-4">产品分类</h3>
          <ul class="space-y-2">
            <li><a href="#" class="text-neutral-300 hover:text-white transition-colors">智能手机</a></li>
            <li><a href="#" class="text-neutral-300 hover:text-white transition-colors">笔记本电脑</a></li>
            <li><a href="#" class="text-neutral-300 hover:text-white transition-colors">平板电脑</a></li>
            <li><a href="#" class="text-neutral-300 hover:text-white transition-colors">可穿戴设备</a></li>
            <li><a href="#" class="text-neutral-300 hover:text-white transition-colors">人工智能</a></li>
          </ul>
        </div>
        
        <div>
          <h3 class="text-lg font-semibold mb-4">联系我们</h3>
          <ul class="space-y-2">
            <li class="text-neutral-300">邮箱: contact@technewshub.com</li>
            <li class="text-neutral-300">电话: +1 123 456 7890</li>
            <li class="text-neutral-300">地址: 123 Tech Street, San Francisco</li>
          </ul>
        </div>
      </div>
      
      <div class="border-t border-neutral-600 pt-8 text-center text-neutral-400 text-sm">
        © 2023 TechNewsHub. 保留所有权利。
      </div>
    </div>
  </footer>
</template>

<script setup>
</script>

<style scoped>
.bg-neutral-700 {
  background-color: #1E1E1E;
}

.bg-neutral-600 {
  background-color: #303133;
}

.text-neutral-300 {
  color: #C0C4CC;
}

.text-neutral-400 {
  color: #909399;
}

.text-primary {
  color: #165DFF;
}

.border-neutral-600 {
  border-color: #303133;
}
</style>
