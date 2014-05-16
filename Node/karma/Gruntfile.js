/*global module:false*/
module.exports = function(grunt) {

  grunt.initConfig({
    lint: {
      files: ['client-sdk/client-core.js']
    },
    jshint: {
      files: ['client-sdk/*.js'],
      options: {
        curly: true,
        eqeqeq: true,
        immed: true,
        latedef: true,
        newcap: true,
        noarg: true,
        sub: true,
        undef: true,
        boss: true,
        eqnull: true,
        browser: true
      },
      globals: {
        require: true,
        define: true,
        requirejs: true,
        describe: true,
        expect: true,
        it: true
      },
      bao: {
        src: ['client-sdk/client-core.js'] 
      }
    },
    pkg: grunt.file.readJSON('package.json'),
    uglify: {
      options: {
        banner: '/*! <%= pkg.name %> <%= grunt.template.today("yyyy-mm-dd") %> */\n'
      },
      build: {
        src: ['client-sdk/client-core.js', 'client-sdk/application-core.js'],
        dest: 'build/<%= namedest %>.js'
      }
    },
    namedest: 'client-core1.min'
  });
  grunt.loadNpmTasks('grunt-contrib-uglify');
  grunt.loadNpmTasks('grunt-contrib-jshint');
  // Default task.
  grunt.registerTask('default', ['uglify']);
  
  
  

};